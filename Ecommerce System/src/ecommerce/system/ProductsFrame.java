/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ecommerce.system;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author DELL
 */
public class ProductsFrame extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    
    Product p1 ;     
    Product p2 ;
    Product p3 ; 
    Product p4 ;

    public ProductsFrame() {
            initComponents();
    
    addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowOpened(java.awt.event.WindowEvent evt) {
            loadProducts();
            System.out.println("ProductsFrame opened with " 
                + Product.getAllProducts().size() + " products");
        }
    });
    
    loadProducts();
    }
    
    private void loadProducts() {
    ArrayList<Product> products = Product.getAllProducts();
    
    if (products.isEmpty()) {
        addDefaultProducts();
        products = Product.getAllProducts();
    }
    
    if (products.size() >= 1) {
        displayProduct1(products.get(0));
    } else {
        hideProduct1(); 
    }
    
    if (products.size() >= 2) {
        displayProduct2(products.get(1));
    } else {
        hideProduct2();
    }
    
    if (products.size() >= 3) {
        displayProduct3(products.get(2));
    } else {
        hideProduct3();
    }
    
    if (products.size() >= 4) {
        displayProduct4(products.get(3));
    } else {
        hideProduct4();
    }
    
    System.out.println("Loaded " + products.size() + " products");
}
    
    private void hideProduct1() {
    catTF.setVisible(false);
}

private void hideProduct2() {
    catTF7.setVisible(false);
}

private void hideProduct3() {
    catTF3.setVisible(false);
}

private void hideProduct4() {
    catTF2.setVisible(false);
}
    
    
    private void addDefaultProducts() {
        p1 = ProductFactoryProvider.getFactory("home appliance", "Washing Machine", 8500, 12, "1500", "A++");
        p2 = ProductFactoryProvider.getFactory("electronics", "Laptop", 35000, 3, "2 years", "Dell");
        p3 = ProductFactoryProvider.getFactory("clothing", "Jacket", 850, 5, "L", "Cotton");
        p4 = ProductFactoryProvider.getFactory("home appliance", "Refrigerator", 12000, 2, "450", "A+");
        
        Product.addProduct(p1);
        Product.addProduct(p2);
        Product.addProduct(p3);
        Product.addProduct(p4);
    }
    
    private void displayProduct1(Product product) {
        p1 = product;
        name1.setText(product.getName());
        price1.setText("$" + product.getPrice());
        stock1.setText(String.valueOf(product.getStock()));
        jLabel17.setText(product.getCategory());
        
        if (product instanceof HomeAppliance) {
            HomeAppliance ha = (HomeAppliance) product;
            s11.setText(ha.getEnergyRating());
            s21.setText(ha.getPowerConsumption() + "W");
            jLabel21.setVisible(true);
            jLabel22.setVisible(true);
            s11.setVisible(true);
            s21.setVisible(true);
        }
    }
    
    
    private void displayProduct2(Product product) {
        p2 = product;
        name2.setText(product.getName());
        price2.setText("$" + product.getPrice());
        stock2.setText(String.valueOf(product.getStock()));
        jLabel73.setText(product.getCategory());
        
        if (product instanceof Electronics) {
            Electronics el = (Electronics) product;
            s12.setText(el.getWarranty());
            s22.setText(el.getBrand());
            jLabel77.setText("Warranty:");
            jLabel78.setText("Brand:");
            jLabel77.setVisible(true);
            jLabel78.setVisible(true);
            s12.setVisible(true);
            s22.setVisible(true);
        }
    }
    
    
    private void displayProduct3(Product product) {
        p3 = product;
        name3.setText(product.getName());
        price3.setText("$" + product.getPrice());
        stock3.setText(String.valueOf(product.getStock()));
        jLabel81.setText(product.getCategory());
        
        if (product instanceof Clothing) {
            Clothing cl = (Clothing) product;
            s13.setText(cl.getSize());
            s23.setText(cl.getMaterial());
            jLabel85.setVisible(true);
            jLabel86.setVisible(true);
            s13.setVisible(true);
            s23.setVisible(true);
        }
    }
    
    
    private void displayProduct4(Product product) {
        p4 = product;
        name4.setText(product.getName());
        price4.setText("$" + product.getPrice());
        stock4.setText(String.valueOf(product.getStock()));
        jLabel89.setText(product.getCategory());
        
        if (product instanceof HomeAppliance) {
            HomeAppliance ha = (HomeAppliance) product;
            s14.setText(ha.getEnergyRating());
            s24.setText(ha.getPowerConsumption() + "W");
            jLabel93.setVisible(true);
            jLabel94.setVisible(true);
            s14.setVisible(true);
            s24.setVisible(true);
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        catTF4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Addtocart8 = new javax.swing.JButton();
        Addtocart9 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        catTF5 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        Addtocart10 = new javax.swing.JButton();
        Addtocart11 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        catTF6 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        Addtocart12 = new javax.swing.JButton();
        Addtocart13 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        MyAccount = new javax.swing.JButton();
        Products = new javax.swing.JButton();
        Orders = new javax.swing.JButton();
        AddProduct = new javax.swing.JButton();
        MyCart = new javax.swing.JButton();
        catTF = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Addtocart111 = new javax.swing.JButton();
        custom1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        stock1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        s11 = new javax.swing.JLabel();
        s21 = new javax.swing.JLabel();
        catTF7 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        Addtocart222 = new javax.swing.JButton();
        custom2 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        stock2 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        s12 = new javax.swing.JLabel();
        s22 = new javax.swing.JLabel();
        catTF3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Addtocart333 = new javax.swing.JButton();
        custom3 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        stock3 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        s13 = new javax.swing.JLabel();
        s23 = new javax.swing.JLabel();
        catTF2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Addtocart444 = new javax.swing.JButton();
        custom4 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        price4 = new javax.swing.JLabel();
        stock4 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        s14 = new javax.swing.JLabel();
        s24 = new javax.swing.JLabel();

        catTF4.setBackground(new java.awt.Color(136, 96, 90));

        jLabel33.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("name :");

        jLabel34.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("category :");

        jLabel35.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("price :");

        jLabel36.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("stock :");

        Addtocart8.setBackground(new java.awt.Color(55, 53, 62));
        Addtocart8.setForeground(new java.awt.Color(255, 255, 255));
        Addtocart8.setText("Add to cart");

        Addtocart9.setBackground(new java.awt.Color(55, 53, 62));
        Addtocart9.setForeground(new java.awt.Color(255, 255, 255));
        Addtocart9.setText("costum");
        Addtocart9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Addtocart9ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("HomeApp");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setOpaque(true);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setOpaque(true);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setOpaque(true);

        jLabel41.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("energyRating :");

        jLabel42.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("powerConsumption :");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setOpaque(true);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setOpaque(true);

        catTF5.setBackground(new java.awt.Color(136, 96, 90));

        jLabel45.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("name :");

        jLabel46.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("category :");

        jLabel47.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("price :");

        jLabel48.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("stock :");

        Addtocart10.setBackground(new java.awt.Color(55, 53, 62));
        Addtocart10.setForeground(new java.awt.Color(255, 255, 255));
        Addtocart10.setText("Add to cart");

        Addtocart11.setBackground(new java.awt.Color(55, 53, 62));
        Addtocart11.setForeground(new java.awt.Color(255, 255, 255));
        Addtocart11.setText("costum");
        Addtocart11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Addtocart11ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("HomeApp");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setOpaque(true);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setOpaque(true);

        jLabel52.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setOpaque(true);

        jLabel53.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("energyRating :");

        jLabel54.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("powerConsumption :");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setOpaque(true);

        jLabel56.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setOpaque(true);

        javax.swing.GroupLayout catTF5Layout = new javax.swing.GroupLayout(catTF5);
        catTF5.setLayout(catTF5Layout);
        catTF5Layout.setHorizontalGroup(
            catTF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTF5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(catTF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF5Layout.createSequentialGroup()
                        .addComponent(Addtocart10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Addtocart11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(catTF5Layout.createSequentialGroup()
                        .addGroup(catTF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(catTF5Layout.createSequentialGroup()
                                .addGroup(catTF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(catTF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(catTF5Layout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        catTF5Layout.setVerticalGroup(
            catTF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTF5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(catTF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(catTF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF5Layout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catTF5Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(catTF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(catTF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(catTF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF5Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(catTF5Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(catTF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addtocart10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addtocart11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout catTF4Layout = new javax.swing.GroupLayout(catTF4);
        catTF4.setLayout(catTF4Layout);
        catTF4Layout.setHorizontalGroup(
            catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTF4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF4Layout.createSequentialGroup()
                        .addComponent(Addtocart8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Addtocart9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(catTF4Layout.createSequentialGroup()
                        .addGroup(catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(catTF4Layout.createSequentialGroup()
                                .addGroup(catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(catTF4Layout.createSequentialGroup()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
            .addGroup(catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(catTF4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(catTF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        catTF4Layout.setVerticalGroup(
            catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTF4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF4Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catTF4Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF4Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(catTF4Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addtocart8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addtocart9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(catTF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(catTF4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(catTF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        catTF6.setBackground(new java.awt.Color(136, 96, 90));

        jLabel57.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("name :");

        jLabel58.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("category :");

        jLabel59.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("price :");

        jLabel60.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("stock :");

        Addtocart12.setBackground(new java.awt.Color(55, 53, 62));
        Addtocart12.setForeground(new java.awt.Color(255, 255, 255));
        Addtocart12.setText("Add to cart");

        Addtocart13.setBackground(new java.awt.Color(55, 53, 62));
        Addtocart13.setForeground(new java.awt.Color(255, 255, 255));
        Addtocart13.setText("costum");
        Addtocart13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Addtocart13ActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("HomeApp");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setOpaque(true);

        jLabel63.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setOpaque(true);

        jLabel64.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setOpaque(true);

        jLabel65.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("energyRating :");

        jLabel66.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("powerConsumption :");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setOpaque(true);

        jLabel68.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setOpaque(true);

        javax.swing.GroupLayout catTF6Layout = new javax.swing.GroupLayout(catTF6);
        catTF6.setLayout(catTF6Layout);
        catTF6Layout.setHorizontalGroup(
            catTF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTF6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(catTF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF6Layout.createSequentialGroup()
                        .addComponent(Addtocart12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Addtocart13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(catTF6Layout.createSequentialGroup()
                        .addGroup(catTF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(catTF6Layout.createSequentialGroup()
                                .addGroup(catTF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(catTF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(catTF6Layout.createSequentialGroup()
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        catTF6Layout.setVerticalGroup(
            catTF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTF6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(catTF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(catTF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF6Layout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catTF6Layout.createSequentialGroup()
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(catTF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(catTF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(catTF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF6Layout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(catTF6Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(catTF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addtocart12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addtocart13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 209, 197));

        jPanel2.setBackground(new java.awt.Color(69, 40, 41));

        MyAccount.setBackground(new java.awt.Color(243, 232, 223));
        MyAccount.setText("MyAccount");
        MyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccountActionPerformed(evt);
            }
        });

        Products.setBackground(new java.awt.Color(243, 232, 223));
        Products.setText("Products");
        Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsActionPerformed(evt);
            }
        });

        Orders.setBackground(new java.awt.Color(243, 232, 223));
        Orders.setText("Orders");
        Orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersActionPerformed(evt);
            }
        });

        AddProduct.setBackground(new java.awt.Color(243, 232, 223));
        AddProduct.setText("Add Product");
        AddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductActionPerformed(evt);
            }
        });

        MyCart.setBackground(new java.awt.Color(243, 232, 223));
        MyCart.setText("MyCart");
        MyCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MyCart, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Orders, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Products, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MyAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(Products, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(MyCart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(MyAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(AddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Orders, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        catTF.setBackground(new java.awt.Color(136, 96, 90));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("name :");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("category :");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("price :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("stock :");

        Addtocart111.setBackground(new java.awt.Color(55, 53, 62));
        Addtocart111.setForeground(new java.awt.Color(255, 255, 255));
        Addtocart111.setText("Add to cart");

        custom1.setBackground(new java.awt.Color(55, 53, 62));
        custom1.setForeground(new java.awt.Color(255, 255, 255));
        custom1.setText("custom");
        custom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custom1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("HomeApp");

        name1.setBackground(new java.awt.Color(136, 96, 90));
        name1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setOpaque(true);

        price1.setBackground(new java.awt.Color(136, 96, 90));
        price1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        price1.setForeground(new java.awt.Color(255, 255, 255));
        price1.setOpaque(true);

        stock1.setBackground(new java.awt.Color(136, 96, 90));
        stock1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        stock1.setForeground(new java.awt.Color(255, 255, 255));
        stock1.setOpaque(true);

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("energyRating :");

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("powerConsumption :");

        s11.setBackground(new java.awt.Color(136, 96, 90));
        s11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        s11.setForeground(new java.awt.Color(255, 255, 255));
        s11.setOpaque(true);

        s21.setBackground(new java.awt.Color(136, 96, 90));
        s21.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        s21.setForeground(new java.awt.Color(255, 255, 255));
        s21.setOpaque(true);

        javax.swing.GroupLayout catTFLayout = new javax.swing.GroupLayout(catTF);
        catTF.setLayout(catTFLayout);
        catTFLayout.setHorizontalGroup(
            catTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTFLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(catTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTFLayout.createSequentialGroup()
                        .addComponent(Addtocart111, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(custom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(catTFLayout.createSequentialGroup()
                        .addGroup(catTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(catTFLayout.createSequentialGroup()
                                .addGroup(catTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(catTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stock1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s11, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(catTFLayout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s21, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        catTFLayout.setVerticalGroup(
            catTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTFLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(catTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(catTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTFLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catTFLayout.createSequentialGroup()
                        .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(catTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(catTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 25, Short.MAX_VALUE)
                .addGroup(catTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catTFLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catTFLayout.createSequentialGroup()
                        .addComponent(s11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(s21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(catTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addtocart111, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custom1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        catTF7.setBackground(new java.awt.Color(136, 96, 90));

        jLabel69.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("name :");

        jLabel70.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("category :");

        jLabel71.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("price :");

        jLabel72.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("stock :");

        Addtocart222.setBackground(new java.awt.Color(55, 53, 62));
        Addtocart222.setForeground(new java.awt.Color(255, 255, 255));
        Addtocart222.setText("Add to cart");

        custom2.setBackground(new java.awt.Color(55, 53, 62));
        custom2.setForeground(new java.awt.Color(255, 255, 255));
        custom2.setText("custom");
        custom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custom2ActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Electronics");

        name2.setBackground(new java.awt.Color(136, 96, 90));
        name2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        name2.setForeground(new java.awt.Color(255, 255, 255));
        name2.setOpaque(true);

        price2.setBackground(new java.awt.Color(136, 96, 90));
        price2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        price2.setForeground(new java.awt.Color(255, 255, 255));
        price2.setOpaque(true);

        stock2.setBackground(new java.awt.Color(136, 96, 90));
        stock2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        stock2.setForeground(new java.awt.Color(255, 255, 255));
        stock2.setOpaque(true);

        jLabel77.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("energyRating :");

        jLabel78.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("brand :");

        s12.setBackground(new java.awt.Color(136, 96, 90));
        s12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        s12.setForeground(new java.awt.Color(255, 255, 255));
        s12.setOpaque(true);

        s22.setBackground(new java.awt.Color(136, 96, 90));
        s22.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        s22.setForeground(new java.awt.Color(255, 255, 255));
        s22.setOpaque(true);

        javax.swing.GroupLayout catTF7Layout = new javax.swing.GroupLayout(catTF7);
        catTF7.setLayout(catTF7Layout);
        catTF7Layout.setHorizontalGroup(
            catTF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTF7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(catTF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF7Layout.createSequentialGroup()
                        .addComponent(Addtocart222, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(custom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(catTF7Layout.createSequentialGroup()
                        .addGroup(catTF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(catTF7Layout.createSequentialGroup()
                                .addGroup(catTF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(catTF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stock2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(catTF7Layout.createSequentialGroup()
                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s22, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        catTF7Layout.setVerticalGroup(
            catTF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTF7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(catTF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(catTF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF7Layout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catTF7Layout.createSequentialGroup()
                        .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(catTF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(catTF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(catTF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF7Layout.createSequentialGroup()
                        .addComponent(s12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(s22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(catTF7Layout.createSequentialGroup()
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(catTF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addtocart222, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custom2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        catTF3.setBackground(new java.awt.Color(136, 96, 90));

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("name :");

        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("category :");

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("price :");

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("stock :");

        Addtocart333.setBackground(new java.awt.Color(55, 53, 62));
        Addtocart333.setForeground(new java.awt.Color(255, 255, 255));
        Addtocart333.setText("Add to cart");

        custom3.setBackground(new java.awt.Color(55, 53, 62));
        custom3.setForeground(new java.awt.Color(255, 255, 255));
        custom3.setText("custom");
        custom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custom3ActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Clothing");

        name3.setBackground(new java.awt.Color(136, 96, 90));
        name3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        name3.setForeground(new java.awt.Color(255, 255, 255));
        name3.setOpaque(true);

        price3.setBackground(new java.awt.Color(136, 96, 90));
        price3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        price3.setForeground(new java.awt.Color(255, 255, 255));
        price3.setOpaque(true);

        stock3.setBackground(new java.awt.Color(136, 96, 90));
        stock3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        stock3.setForeground(new java.awt.Color(255, 255, 255));
        stock3.setOpaque(true);

        jLabel85.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("size :");

        jLabel86.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("material :");

        s13.setBackground(new java.awt.Color(136, 96, 90));
        s13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        s13.setForeground(new java.awt.Color(255, 255, 255));
        s13.setOpaque(true);

        s23.setBackground(new java.awt.Color(136, 96, 90));
        s23.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        s23.setForeground(new java.awt.Color(255, 255, 255));
        s23.setOpaque(true);

        javax.swing.GroupLayout catTF3Layout = new javax.swing.GroupLayout(catTF3);
        catTF3.setLayout(catTF3Layout);
        catTF3Layout.setHorizontalGroup(
            catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTF3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF3Layout.createSequentialGroup()
                        .addComponent(Addtocart333, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(custom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(catTF3Layout.createSequentialGroup()
                        .addGroup(catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(catTF3Layout.createSequentialGroup()
                                .addGroup(catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stock3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s13, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(catTF3Layout.createSequentialGroup()
                                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s23, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        catTF3Layout.setVerticalGroup(
            catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTF3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catTF3Layout.createSequentialGroup()
                        .addComponent(price3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(catTF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addtocart333, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custom3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        catTF2.setBackground(new java.awt.Color(136, 96, 90));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("name :");

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("category :");

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("price :");

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("stock :");

        Addtocart444.setBackground(new java.awt.Color(55, 53, 62));
        Addtocart444.setForeground(new java.awt.Color(255, 255, 255));
        Addtocart444.setText("Add to cart");

        custom4.setBackground(new java.awt.Color(55, 53, 62));
        custom4.setForeground(new java.awt.Color(255, 255, 255));
        custom4.setText("custom");
        custom4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custom4ActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("HomeApp");

        name4.setBackground(new java.awt.Color(136, 96, 90));
        name4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        name4.setForeground(new java.awt.Color(255, 255, 255));
        name4.setOpaque(true);

        price4.setBackground(new java.awt.Color(136, 96, 90));
        price4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        price4.setForeground(new java.awt.Color(255, 255, 255));
        price4.setOpaque(true);

        stock4.setBackground(new java.awt.Color(136, 96, 90));
        stock4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        stock4.setForeground(new java.awt.Color(255, 255, 255));
        stock4.setOpaque(true);

        jLabel93.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("energyRating :");

        jLabel94.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("powerConsumption :");

        s14.setBackground(new java.awt.Color(136, 96, 90));
        s14.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        s14.setForeground(new java.awt.Color(255, 255, 255));
        s14.setOpaque(true);

        s24.setBackground(new java.awt.Color(136, 96, 90));
        s24.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        s24.setForeground(new java.awt.Color(255, 255, 255));
        s24.setOpaque(true);

        javax.swing.GroupLayout catTF2Layout = new javax.swing.GroupLayout(catTF2);
        catTF2.setLayout(catTF2Layout);
        catTF2Layout.setHorizontalGroup(
            catTF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTF2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(catTF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF2Layout.createSequentialGroup()
                        .addComponent(Addtocart444, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(custom4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(catTF2Layout.createSequentialGroup()
                        .addGroup(catTF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(catTF2Layout.createSequentialGroup()
                                .addGroup(catTF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(catTF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stock4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s14, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(catTF2Layout.createSequentialGroup()
                                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s24, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        catTF2Layout.setVerticalGroup(
            catTF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catTF2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(catTF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(catTF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catTF2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catTF2Layout.createSequentialGroup()
                        .addComponent(price4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(catTF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(catTF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(catTF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catTF2Layout.createSequentialGroup()
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catTF2Layout.createSequentialGroup()
                        .addComponent(s14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(s24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(catTF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addtocart444, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custom4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(catTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(catTF7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(catTF2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(catTF3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(catTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(catTF3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(catTF7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(catTF2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccountActionPerformed
        this.dispose();
        new MyAccountFrame().setVisible(true);
    }//GEN-LAST:event_MyAccountActionPerformed

    private void ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsActionPerformed
    catTF.setVisible(true);
    catTF7.setVisible(true);
    catTF3.setVisible(true);
    catTF2.setVisible(true);
    
    loadProducts();
    
    javax.swing.JOptionPane.showMessageDialog(this, 
        "Products page refreshed!\n" +
        "Total Products: " + Product.getAllProducts().size());
    }//GEN-LAST:event_ProductsActionPerformed

    private void OrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersActionPerformed
        this.dispose();
        new OrdersFrame().setVisible(true);
    }//GEN-LAST:event_OrdersActionPerformed

    private void AddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductActionPerformed
        this.dispose();
        new AddProductFrame().setVisible(true);
    }//GEN-LAST:event_AddProductActionPerformed

    private void MyCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyCartActionPerformed
        this.dispose();
        new MyCartFrame().setVisible(true);
    }//GEN-LAST:event_MyCartActionPerformed

    private void custom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custom1ActionPerformed

    private void Addtocart9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addtocart9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Addtocart9ActionPerformed

    private void Addtocart11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addtocart11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Addtocart11ActionPerformed

    private void Addtocart13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addtocart13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Addtocart13ActionPerformed

    private void custom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custom2ActionPerformed

    private void custom3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custom3ActionPerformed

    private void custom4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custom4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProduct;
    private javax.swing.JButton Addtocart10;
    private javax.swing.JButton Addtocart11;
    private javax.swing.JButton Addtocart111;
    private javax.swing.JButton Addtocart12;
    private javax.swing.JButton Addtocart13;
    private javax.swing.JButton Addtocart222;
    private javax.swing.JButton Addtocart333;
    private javax.swing.JButton Addtocart444;
    private javax.swing.JButton Addtocart8;
    private javax.swing.JButton Addtocart9;
    private javax.swing.JButton MyAccount;
    private javax.swing.JButton MyCart;
    private javax.swing.JButton Orders;
    private javax.swing.JButton Products;
    private javax.swing.JPanel catTF;
    private javax.swing.JPanel catTF2;
    private javax.swing.JPanel catTF3;
    private javax.swing.JPanel catTF4;
    private javax.swing.JPanel catTF5;
    private javax.swing.JPanel catTF6;
    private javax.swing.JPanel catTF7;
    private javax.swing.JButton custom1;
    private javax.swing.JButton custom2;
    private javax.swing.JButton custom3;
    private javax.swing.JButton custom4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price3;
    private javax.swing.JLabel price4;
    private javax.swing.JLabel s11;
    private javax.swing.JLabel s12;
    private javax.swing.JLabel s13;
    private javax.swing.JLabel s14;
    private javax.swing.JLabel s21;
    private javax.swing.JLabel s22;
    private javax.swing.JLabel s23;
    private javax.swing.JLabel s24;
    private javax.swing.JLabel stock1;
    private javax.swing.JLabel stock2;
    private javax.swing.JLabel stock3;
    private javax.swing.JLabel stock4;
    // End of variables declaration//GEN-END:variables
}
