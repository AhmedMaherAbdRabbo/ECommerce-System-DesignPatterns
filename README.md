# ECommerce-System-DesignPatterns


# 🛒 E-Commerce System Documentation

> **A comprehensive e-commerce system implementing six core design patterns to create a flexible, maintainable, and scalable online shopping platform with advanced features for product management, order processing, and real-time cart updates.**

---

## 📋 Table of Contents

1. [Project Overview](#-project-overview)
2. [Design Patterns Overview](#-design-patterns-overview)
4. [Detailed Class Documentation](#-detailed-class-documentation)
5. [Pattern Implementation Details](#-pattern-implementation-details)
6. [Usage Examples](#-usage-examples)

---

## 🎯 Project Overview

### Introduction

This e-commerce system is a Java-based application designed to handle the complete lifecycle of online shopping operations. The system leverages **six fundamental design patterns** to create a robust architecture that supports:

- **Product Management**: Multiple product categories with customizable features
- **Shopping Cart**: Real-time cart updates with observer notifications
- **Order Processing**: Flexible order handling with different delivery options
- **Payment Integration**: Secure payment gateway for multiple payment methods
- **Product Customization**: Dynamic product enhancements through decorators

### Core Features

- ✅ **Multi-Category Product Support**: Electronics, Clothing, Home Appliances
- ✅ **Dynamic Product Decoration**: Gift wrapping, premium packaging
- ✅ **Flexible Order Processing**: Standard and Express delivery
- ✅ **Real-Time Cart Updates**: Observer pattern for UI synchronization
- ✅ **Secure Payment Processing**: Singleton payment gateway
- ✅ **Product Cloning**: Efficient prototype pattern for product duplication

---

## 🎨 Design Patterns Overview

This system implements six design patterns, each serving a specific architectural purpose:

| Pattern | Purpose | Implementation |
|---------|---------|----------------|
| **Singleton** | Ensure single instances of critical services | `CartManager`, `PaymentGateway` |
| **Factory** | Encapsulate product creation logic | `ProductFactoryProvider`, `OrderProcessorFactory` |
| **Prototype** | Enable efficient object cloning | `Product.clone()` |
| **Decorator** | Add features dynamically to products | `GiftWrapDecorator`, `PremiumPackageDecorator` |
| **Observer** | Real-time cart update notifications | `CartObserver` interface |
| **Builder** | Simplify complex order construction | `OrderBuilder` |

---

## 📚 Detailed Class Documentation

### Core Domain Classes

#### 1. **Product** (Abstract Base Class)

**Purpose**: Serves as the foundation for all product types in the system, implementing the Prototype pattern.

**Key Responsibilities**:
- Define common product attributes (name, price, category, stock)
- Provide abstract methods for product details and cloning
- Support inheritance for specialized product types

**Attributes**:
```java
protected String name;        // Product name
protected double price;       // Product price in currency
protected String category;    // Product category
protected int stock;          // Available stock quantity
```

**Key Methods**:
- `abstract String getDetails()`: Returns product-specific details
- `abstract Product clone()`: Creates a deep copy of the product (Prototype pattern)
- `getPrice()`, `setStock()`: Standard getters/setters

**Design Pattern**: **Prototype** - Enables efficient product duplication

---

#### 2. **Electronics** (Product Subclass)

**Purpose**: Represents electronic products with warranty and brand information.

**Additional Attributes**:
```java
private String warranty;  // Warranty period (e.g., "2 years")
private String brand;     // Product brand (e.g., "Dell", "Apple")
```

**Implementation Details**:
```java
@Override
public String getDetails() {
    return "Brand: " + brand + ", Warranty: " + warranty;
}

@Override
public Product clone() {
    return new Electronics(
        this.warranty, this.brand, 
        this.name, this.price, 
        this.category, this.stock
    );
}
```

**Use Case**: Laptops, smartphones, tablets, cameras

---

#### 3. **Clothing** (Product Subclass)

**Purpose**: Represents clothing items with size and material specifications.

**Additional Attributes**:
```java
private String size;      // Size (e.g., "M", "L", "XL")
private String material;  // Material (e.g., "Cotton", "Polyester")
```

**Implementation Details**:
```java
@Override
public String getDetails() {
    return "Size: " + size + ", Material: " + material;
}
```

**Use Case**: Shirts, pants, dresses, jackets

---

#### 4. **HomeAppliance** (Product Subclass)

**Purpose**: Represents home appliances with power consumption and energy rating.

**Additional Attributes**:
```java
private int powerConsumption;    // Power in Watts
private String energyRating;     // Rating (e.g., "A++", "B")
```

**Implementation Details**:
```java
@Override
public String getDetails() {
    return "Power: " + powerConsumption + "W, Rating: " + energyRating;
}
```

**Use Case**: Refrigerators, washing machines, air conditioners

---

### Decorator Pattern Classes

#### 5. **BaseProductDecorator** (Abstract Decorator)

**Purpose**: Base class for all product decorators, wrapping products with additional features.

**Key Responsibilities**:
- Maintain reference to wrapped product
- Delegate all method calls to wrapped product
- Allow decoration chaining

**Implementation**:
```java
protected Product product_decrator;

public BaseProductDecorator(Product product) {
    super(product.getName(), product.getPrice(), 
          product.getCategory(), product.getStock());
    this.product_decrator = product;
}
```

**Design Pattern**: **Decorator** - Enables dynamic feature addition

---

#### 6. **GiftWrapDecorator** (Concrete Decorator)

**Purpose**: Adds gift wrapping service to products with customizable styles.

**Additional Features**:
```java
private double wrapCost = 75;    // Gift wrap cost
private String style;            // Wrap style (e.g., "birthday", "wedding")
```

**Price Calculation**:
```java
@Override
public double getPrice() {
    return product_decrator.getPrice() + wrapCost;
}
```

**Details Enhancement**:
```java
@Override
public String getDetails() {
    return product_decrator.getDetails() + ", Gift Wrap (" + style + ")";
}
```

---

#### 7. **PremiumPackageDecorator** (Concrete Decorator)

**Purpose**: Adds premium packaging service for enhanced product protection and presentation.

**Additional Features**:
```java
protected double premiumPackage = 160;  // Premium package cost
```

**Enhancement**:
```java
@Override
public String getDetails() {
    return product_decrator.getDetails() + ", Premium Package";
}
```

**Use Case**: Fragile items, luxury products, gifts

---

### Factory Pattern Classes


#### 8. **ProductFactoryProvider** (Factory Provider)

**Purpose**: Provides the appropriate factory based on product category.

**Implementation**:
```java
    public static Product getFactory(String category, String name , double price ,int stock  , String spec1, String spec2) {
        switch(category.toLowerCase()) {
            case "electronics":
                return new Electronics(name , price , category , stock,  spec1, spec2);
            
            case "clothing":
                return new Clothing(name , price , category , stock,  spec1, spec2);
            
            case "home appliance":
                int power = Integer.parseInt(spec1);
                return new HomeAppliance(name , price , category , stock,  spec1, spec2);
            
            default:
                throw new IllegalArgumentException("Unknown category: " + category);
        }
    }
```

---

### Singleton Pattern Classes

#### 13. **CartManager** (Singleton)

**Purpose**: Manages the shopping cart with single-instance guarantee across the application.

**Singleton Implementation**:
```java
private static CartManager instance;

private CartManager() {
    cartItems = new ArrayList<>();
    observers = new ArrayList<>();
}

public static CartManager getInstance() {
    if (instance == null) {
        instance = new CartManager();
    }
    return instance;
}
```

**Key Responsibilities**:
- Maintain cart items list
- Calculate cart total
- Notify observers on cart changes
- Manage cart item quantities

**Core Methods**:
```java
public void addItem(Product product, int quantity)
public void removeItem(String productName)
public void updateQuantity(Product product, int newQty)
public double calculateTotal()
public void clearCart()
```

**Observer Integration**:
```java
private void notifyObservers() {
    double total = calculateTotal();
    for (CartObserver observer : observers) {
        observer.update(cartItems, total);
    }
}
```

---

#### 14. **PaymentGateway** (Singleton)

**Purpose**: Handles payment processing with single-instance guarantee for security and consistency.

**Singleton Implementation**:
```java
private static PaymentGateway instance;

private PaymentGateway() {}

public static PaymentGateway getInstance() {
    if (instance == null) {
        instance = new PaymentGateway();
    }
    return instance;
}
```

**Payment Methods**:
```java
public boolean processCreditCard(String cardNumber, double amount)
public boolean processPayPal(String email, double amount)
private boolean validatePayment(double amount)
```

---

### Observer Pattern Classes

#### 15. **CartObserver** (Observer Interface)

**Purpose**: Defines the contract for objects that need to be notified of cart changes.

**Method Signature**:
```java
public abstract void update(List<CartItem> items, double total);
```

**Design Pattern**: **Observer** - Enables real-time UI updates

---

#### 16. **CartPageObserver** (Concrete Observer)

**Purpose**: Observes cart changes and updates the cart page UI.

**Use Case**: Updates cart display when items are added/removed/modified

---

#### 17. **CheckoutObserver** (Concrete Observer)

**Purpose**: Observes cart changes and updates the checkout page.

**Use Case**: Reflects cart total and items during checkout process

---

### Builder Pattern Classes

#### 18. **OrderBuilder** (Builder)

**Purpose**: Simplifies complex order construction with a fluent interface.

**Fluent Interface Methods**:
```java
public OrderBuilder setCustomer(Customer customer)
public OrderBuilder setDeliveryType(String deliveryType)
public OrderBuilder setPaymentMethod(String paymentMethod)
public OrderBuilder setShippingAddress(String shippingAddress)
public Order build()
```

**Usage Example**:
```java
Order order = new OrderBuilder()
    .setCustomer(customer)
    .setDeliveryType("Express")
    .setPaymentMethod("Credit Card")
    .setShippingAddress("123 Main St")
    .build();
```

**Design Pattern**: **Builder** - Separates construction from representation

---

#### 19. **Order** (Product of Builder)

**Purpose**: Represents a customer order with delivery and payment details.

**Attributes**:
```java
private Customer customer;
private String deliveryType;      // "Standard" or "Express"
private String paymentMethod;     // "Credit Card", "PayPal", etc.
private String shippingAddress;
private String orderStatus;       // "Pending", "Processing", "Shipped", "Delivered"
```

---

### Factory Pattern for Order Processing

#### 20. **OrderProcessor** (Strategy Interface)

**Purpose**: Defines the contract for different order processing strategies.

**Methods**:
```java
void processOrder(Order order);
double calculateShippingCost(Order order);
String getEstimatedDelivery();
```

---

#### 21. **StandardOrderProcessor** (Concrete Strategy)

**Purpose**: Processes standard delivery orders.

**Implementation**:
```java
@Override
public void processOrder(Order order) {
    System.out.println("Processing Standard Order");
    order.setOrderStatus("Processing");
}

@Override
public double calculateShippingCost(Order order) {
    return 50.0;  // Standard shipping cost
}

@Override
public String getEstimatedDelivery() {
    return "5-7 Business Days";
}
```

---

#### 22. **ExpressOrderProcessor** (Concrete Strategy)

**Purpose**: Processes express delivery orders with faster shipping.

**Implementation**:
```java
@Override
public double calculateShippingCost(Order order) {
    return 150.0;  // Express shipping cost
}

@Override
public String getEstimatedDelivery() {
    return "1-2 Business Days";
}
```

---

#### 23. **OrderProcessorFactory** (Factory)

**Purpose**: Creates the appropriate order processor based on delivery type.

**Implementation**:
```java
public static OrderProcessor getProcessor(String deliveryType) {
    if (deliveryType == null) {
        return new StandardOrderProcessor();
    }
    
    switch(deliveryType.toLowerCase()) {
        case "express":
            return new ExpressOrderProcessor();
        case "standard":
            return new StandardOrderProcessor();
        default:
            return new StandardOrderProcessor();
    }
}
```

---

### Supporting Classes

#### 24. **Customer**

**Purpose**: Represents a customer with contact and address information.

**Attributes**:
```java
private String name;
private String email;
private String address;
```

---

#### 25. **CartItem**

**Purpose**: Represents an item in the shopping cart with quantity tracking.

**Attributes**:
```java
private Product product;
private int quantity;
```

**Key Method**:
```java
public double getTotalPrice() {
    return product.getPrice() * quantity;
}
```

---

## 🎯 Pattern Implementation Details

### 1. Singleton Pattern

**Implementation Classes**: `CartManager`, `PaymentGateway`

**Purpose**: Ensures only one instance exists throughout the application lifecycle.

**Why It's Used**:
- **CartManager**: Maintains a single global shopping cart state
- **PaymentGateway**: Centralizes payment processing for security and consistency

**Implementation Strategy**:
```java
// Lazy initialization with null check
private static CartManager instance;

private CartManager() {
    // Private constructor prevents external instantiation
}

public static CartManager getInstance() {
    if (instance == null) {
        instance = new CartManager();
    }
    return instance;
}
```

**Benefits**:
- ✅ Global access point for cart operations
- ✅ Prevents multiple cart instances causing data inconsistency
- ✅ Reduces memory footprint

---

### 2. Factory Pattern

**Implementation Classes**:  `OrderProcessorFactory`, `ProductFactoryProvider`

**Purpose**: Encapsulates object creation logic, allowing flexible product and processor instantiation.

**Why It's Used**:
- **Product Creation**: Different product categories require different initialization parameters
- **Order Processing**: Different delivery types require different processing strategies

**Product Factory Flow**:
**Benefits**:
- ✅ Separation of creation logic from business logic
- ✅ Easy to add new product categories
- ✅ Centralized product creation management

---

### 3. Prototype Pattern

**Implementation**: `Product.clone()` method in all product classes

**Purpose**: Enables efficient duplication of existing products without recreating from scratch.

**Why It's Used**:
- Create similar products with minor variations
- Avoid expensive re-initialization
- Support product template functionality

**Clone Implementation Example**:
```java
@Override
public Product clone() {
    return new Electronics(
        this.warranty,      // Copy warranty
        this.brand,         // Copy brand
        this.name,          // Copy name
        this.price,         // Copy price
        this.category,      // Copy category
        this.stock          // Copy stock
    );
}
```

**Use Case Scenario**:
```java
// Create template product
Product laptopTemplate = new Electronics("2 years", "Dell", "Laptop", 25000, "Electronics", 5);

// Clone for similar products
Product laptop1 = laptopTemplate.clone();
Product laptop2 = laptopTemplate.clone();

// Modify clones independently
laptop1.setStock(10);
laptop2.setStock(15);
```

**Benefits**:
- ✅ Faster object creation than constructors
- ✅ Avoids complex initialization logic repetition
- ✅ Supports dynamic product templating

---

### 4. Decorator Pattern

**Implementation Classes**: `BaseProductDecorator`, `GiftWrapDecorator`, `PremiumPackageDecorator`

**Purpose**: Dynamically add features to products without modifying their core structure.

**Why It's Used**:
- Add optional services (gift wrap, premium packaging)
- Maintain open/closed principle (open for extension, closed for modification)
- Support multiple decorations on same product

**Decoration Chain Example**:
```java
// Base product
Product laptop = new Electronics("2 years", "Dell", "Laptop", 25000, "Electronics", 5);

// Add gift wrap
laptop = new GiftWrapDecorator(laptop, "birthday");

// Add premium package
laptop = new PremiumPackageDecorator(laptop);

// Final price: 25000 + 75 (gift wrap) + 160 (premium) = 25235
System.out.println(laptop.getPrice());  // 25235

// Final details: "Brand: Dell, Warranty: 2 years, Gift Wrap (birthday), Premium Package"
System.out.println(laptop.getDetails());
```



**Benefits**:
- ✅ Flexible feature combination
- ✅ No need for multiple product subclasses
- ✅ Runtime decoration capability

---

### 5. Observer Pattern

**Implementation Classes**: `CartObserver`, `CartPageObserver`, `CheckoutObserver`, `CartManager`

**Purpose**: Notify interested parties (observers) when cart state changes.

**Why It's Used**:
- Real-time UI updates when cart changes
- Decouple cart logic from display logic
- Support multiple observers (cart page, checkout page, header badge)

**Implementation**:
```java
// CartManager maintains observer list
private List<CartObserver> observers;

// Register observers
public void addObserver(CartObserver observer) {
    observers.add(observer);
}

// Notify all observers on cart change
private void notifyObservers() {
    double total = calculateTotal();
    for (CartObserver observer : observers) {
        observer.update(cartItems, total);
    }
}
```

**Benefits**:
- ✅ Automatic UI synchronization
- ✅ Loose coupling between cart and UI
- ✅ Easy to add new observers

---

### 6. Builder Pattern

**Implementation Classes**: `OrderBuilder`, `Order`

**Purpose**: Simplify complex order object construction with optional parameters.

**Why It's Used**:
- Order has multiple optional attributes (delivery type, payment method, address)
- Avoids telescoping constructor anti-pattern
- Provides readable, fluent API for order creation

**Builder Comparison**:

**Without Builder** (Telescoping Constructors):
```java
// Confusing parameter order
Order order = new Order(customer, "Express", "Credit Card", "123 Main St");
```

**With Builder** (Fluent Interface):
```java
// Clear, readable order construction
Order order = new OrderBuilder()
    .setCustomer(customer)
    .setDeliveryType("Express")
    .setPaymentMethod("Credit Card")
    .setShippingAddress("123 Main St")
    .build();
```

**Benefits**:
- ✅ Readable, self-documenting code
- ✅ Flexible parameter setting
- ✅ Immutable order objects

---

## 💻 Usage Examples

### Complete E-Commerce Workflow

```java
public class EcommerceWorkflowDemo {
    public static void main(String[] args) {
        // 1. Create Product using Factory
        ProductFactory factory = ProductFactoryProvider.getFactory(
            "electronics", "2 years", "Dell"
        );
        Product laptop = factory.createProduct("Gaming Laptop", 25000, 10);
        
        // 2. Decorate Product with additional features
        laptop = new GiftWrapDecorator(laptop, "birthday");
        laptop = new PremiumPackageDecorator(laptop);
        
        System.out.println("Product: " + laptop.getName());
        System.out.println("Price: " + laptop.getPrice());
        System.out.println("Details: " + laptop.getDetails());
        
        // 3. Add to Cart (Singleton)
        CartManager cart = CartManager.getInstance();
        
        // Register observers
        cart.addObserver(new CartPageObserver());
        cart.addObserver(new CheckoutObserver());
        
        cart.addItem(laptop, 2);
        
        // 4. Create Customer
        Customer customer = new Customer(
            "Ali Ahmed", 
            "ali@example.com", 
            "Cairo, Egypt"
        );
        
        // 5. Build Order using Builder
        Order order = new OrderBuilder()
            .setCustomer(customer)
            .setDeliveryType("Express")
            .setPaymentMethod("Credit Card")
            .setShippingAddress("123 Main St, Cairo")
            .build();
        
        // 6. Process Order using Factory
        OrderProcessor processor = OrderProcessorFactory.getProcessor(
            order.getDeliveryType()
        );
        processor.processOrder(order);
        
        double shippingCost = processor.calculateShippingCost(order);
        String delivery = processor.getEstimatedDelivery();
        
        System.out.println("Shipping Cost: " + shippingCost);
        System.out.println("Estimated Delivery: " + delivery);
        
        // 7. Process Payment using Singleton
        PaymentGateway gateway = PaymentGateway.getInstance();
        double totalAmount = cart.calculateTotal() + shippingCost;
        
        boolean paymentSuccess = gateway.processCreditCard(
            "1234-5678-9012-3456", 
            totalAmount
        );
        
        if (paymentSuccess) {
            System.out.println("Payment Successful!");
            order.setOrderStatus("Confirmed");
            cart.clearCart();
        }
    }
}
```

### Example 2: Product Cloning with Prototype Pattern

```java
public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Create original product
        Product originalLaptop = new Electronics(
            "2 years", 
            "Dell", 
            "XPS 15", 
            30000, 
            "Electronics", 
            5
        );
        
        // Clone product
        Product clonedLaptop = originalLaptop.clone();
        
        // Modify clone independently
        clonedLaptop.setStock(10);
        
        System.out.println("Original Stock: " + originalLaptop.getStock());  // 5
        System.out.println("Cloned Stock: " + clonedLaptop.getStock());      // 10
        
        // Verify different objects
        System.out.println("Same object? " + (originalLaptop == clonedLaptop));  // false
    }
}
```

### Example 3: Decorator Pattern Chaining

```java
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Base product
        Product shirt = new Clothing(
            "L", 
            "Cotton", 
            "T-Shirt", 
            200, 
            "Clothing", 
            50
        );
        
        System.out.println("Base Price: " + shirt.getPrice());        // 200
        System.out.println("Base Details: " + shirt.getDetails());    // Size: L, Material: Cotton
        
        // Add gift wrap
        shirt = new GiftWrapDecorator(shirt, "wedding");
        System.out.println("After Gift Wrap: " + shirt.getPrice());   // 275
        
        // Add premium package
        shirt = new PremiumPackageDecorator(shirt);
        System.out.println("After Premium: " + shirt.getPrice());     // 435
        System.out.println("Final Details: " + shirt.getDetails());   
        // Size: L, Material: Cotton, Gift Wrap (wedding), Premium Package
    }
}
```

### Example 4: Observer Pattern with Cart Updates

```java
public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Get cart instance (Singleton)
        CartManager cart = CartManager.getInstance();
        
        // Create custom observer
        CartObserver customObserver = new CartObserver() {
            @Override
            public void update(List<CartItem> items, double total) {
                System.out.println("Cart Updated!");
                System.out.println("Items: " + items.size());
                System.out.println("Total: " + total);
            }
        };
        
        // Register observer
        cart.addObserver(customObserver);
        
        // Create products
        Product laptop = new Electronics("1 year", "HP", "Laptop", 15000, "Electronics", 10);
        Product mouse = new Electronics("6 months", "Logitech", "Mouse", 300, "Electronics", 50);
        
        // Add items (triggers observer notifications)
        cart.addItem(laptop, 1);    // Observer notified
        cart.addItem(mouse, 2);     // Observer notified again
        
        // Update quantity (triggers notification)
        cart.updateQuantity(laptop, 2);  // Observer notified
    }
}
```

---

## 🎓 Key Takeaways

### Design Pattern Benefits

1. **Singleton**: Ensures consistency and prevents resource duplication
2. **Factory**: Centralizes creation logic, enabling easy extensibility
3. **Prototype**: Optimizes performance through efficient cloning
4. **Decorator**: Provides flexible feature composition without class explosion
5. **Observer**: Enables reactive UI updates and loose coupling
6. **Builder**: Simplifies complex object construction with readable code

### System Advantages

- ✅ **Maintainability**: Clear separation of concerns
- ✅ **Scalability**: Easy to add new products, features, and observers
- ✅ **Flexibility**: Dynamic feature composition and configuration
- ✅ **Testability**: Each component can be tested independently
- ✅ **Reusability**: Patterns enable code reuse across different contexts

### Pattern Comparison Table

| Pattern | Complexity | Flexibility | Use When |
|---------|-----------|-------------|----------|
| **Singleton** | Low | Low | Need single instance |
| **Factory** | Medium | High | Multiple object types |
| **Prototype** | Low | Medium | Expensive object creation |
| **Decorator** | Medium | Very High | Dynamic feature addition |
| **Observer** | Medium | High | Event-driven updates |
| **Builder** | Medium | High | Complex object construction |

---


**🛒 Built with Design Patterns Excellence