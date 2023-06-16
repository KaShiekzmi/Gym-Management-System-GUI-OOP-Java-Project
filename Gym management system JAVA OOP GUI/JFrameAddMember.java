package project_oop;
import javax.swing.*;
public class JFrameAddMember extends javax.swing.JFrame {

    Gym gym = new Gym();
    Member member = new Member();
    Date date = new Date();
    Payment payment = new Payment();
    public JFrameAddMember(){
        initComponents();
        txtRegNo.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtRegNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listJoinMonth = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listJoinDate = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listJoinYear = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listBirthMonth = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listBirthDate = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        listBirthYear = new javax.swing.JList<>();
        jLabel20 = new javax.swing.JLabel();
        radioBtnMale = new javax.swing.JRadioButton();
        radioBtnFemale = new javax.swing.JRadioButton();
        radioBtnOther = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        radioBtnWeightLoss = new javax.swing.JRadioButton();
        radioBtnMuscleGain = new javax.swing.JRadioButton();
        radioBtnShredding = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        txtOutStandingBalance = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtCCAccountHolder = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtCreditCardNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnGenerateRegId = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 43, 42));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Member");

        txtRegNo.setBackground(new java.awt.Color(35, 43, 42));
        txtRegNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRegNo.setForeground(new java.awt.Color(255, 255, 255));
        txtRegNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtRegNo.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegNoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Reg no.");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Name:");

        txtName.setBackground(new java.awt.Color(35, 43, 42));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtName.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtGmail.setBackground(new java.awt.Color(35, 43, 42));
        txtGmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGmail.setForeground(new java.awt.Color(255, 255, 255));
        txtGmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtGmail.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtGmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGmailActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Gmail:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Phone no (03XX-XXXXXXX):");

        txtPhoneNo.setBackground(new java.awt.Color(35, 43, 42));
        txtPhoneNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        txtPhoneNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtPhoneNo.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNoActionPerformed(evt);
            }
        });

        txtAddress.setBackground(new java.awt.Color(35, 43, 42));
        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtAddress.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Address:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Date of join(MM-DD-YYYY):");

        listJoinMonth.setBackground(new java.awt.Color(35, 43, 42));
        listJoinMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listJoinMonth.setForeground(new java.awt.Color(255, 255, 255));
        listJoinMonth.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listJoinMonth.setSelectedIndex(0);
        jScrollPane2.setViewportView(listJoinMonth);

        listJoinDate.setBackground(new java.awt.Color(35, 43, 42));
        listJoinDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listJoinDate.setForeground(new java.awt.Color(255, 255, 255));
        listJoinDate.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listJoinDate.setSelectedIndex(0);
        jScrollPane1.setViewportView(listJoinDate);

        listJoinYear.setBackground(new java.awt.Color(35, 43, 42));
        listJoinYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listJoinYear.setForeground(new java.awt.Color(255, 255, 255));
        listJoinYear.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Select", "2023", "2022", "2021", "2020", "2019", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listJoinYear.setSelectedIndex(0);
        jScrollPane3.setViewportView(listJoinYear);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Date of birth(MM-DD-YYYY):");

        listBirthMonth.setBackground(new java.awt.Color(35, 43, 42));
        listBirthMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listBirthMonth.setForeground(new java.awt.Color(255, 255, 255));
        listBirthMonth.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBirthMonth.setSelectedIndex(0);
        jScrollPane5.setViewportView(listBirthMonth);

        listBirthDate.setBackground(new java.awt.Color(35, 43, 42));
        listBirthDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listBirthDate.setForeground(new java.awt.Color(255, 255, 255));
        listBirthDate.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBirthDate.setSelectedIndex(0);
        jScrollPane4.setViewportView(listBirthDate);

        listBirthYear.setBackground(new java.awt.Color(35, 43, 42));
        listBirthYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listBirthYear.setForeground(new java.awt.Color(255, 255, 255));
        listBirthYear.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Select", "2023", "2022", "2021", "2020", "2019", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBirthYear.setSelectedIndex(0);
        jScrollPane6.setViewportView(listBirthYear);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Gender:");

        buttonGroup1.add(radioBtnMale);
        radioBtnMale.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnMale.setText("Male");
        radioBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtnFemale);
        radioBtnFemale.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnFemale.setText("Female");
        radioBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnFemaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtnOther);
        radioBtnOther.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnOther.setText("Other");
        radioBtnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnOtherActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Height:");

        txtHeight.setBackground(new java.awt.Color(35, 43, 42));
        txtHeight.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHeight.setForeground(new java.awt.Color(255, 255, 255));
        txtHeight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtHeight.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Weight:");

        txtWeight.setBackground(new java.awt.Color(35, 43, 42));
        txtWeight.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWeight.setForeground(new java.awt.Color(255, 255, 255));
        txtWeight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtWeight.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Fitness goal:");

        buttonGroup2.add(radioBtnWeightLoss);
        radioBtnWeightLoss.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnWeightLoss.setText("Weight loss");
        radioBtnWeightLoss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnWeightLossActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioBtnMuscleGain);
        radioBtnMuscleGain.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnMuscleGain.setText("Muscle gain");
        radioBtnMuscleGain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMuscleGainActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioBtnShredding);
        radioBtnShredding.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnShredding.setText("Shredding");
        radioBtnShredding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnShreddingActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Out standing balance:");

        txtOutStandingBalance.setBackground(new java.awt.Color(35, 43, 42));
        txtOutStandingBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOutStandingBalance.setForeground(new java.awt.Color(255, 255, 255));
        txtOutStandingBalance.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtOutStandingBalance.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtOutStandingBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOutStandingBalanceActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Credit card account holder:");

        txtCCAccountHolder.setBackground(new java.awt.Color(35, 43, 42));
        txtCCAccountHolder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCCAccountHolder.setForeground(new java.awt.Color(255, 255, 255));
        txtCCAccountHolder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCCAccountHolder.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtCCAccountHolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCCAccountHolderActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Credit card number:");

        txtCreditCardNumber.setBackground(new java.awt.Color(35, 43, 42));
        txtCreditCardNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCreditCardNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtCreditCardNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCreditCardNumber.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtCreditCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditCardNumberActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(17, 122, 102));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(17, 122, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnGenerateRegId.setBackground(new java.awt.Color(17, 122, 102));
        btnGenerateRegId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenerateRegId.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateRegId.setText("Generate number");
        btnGenerateRegId.setBorder(null);
        btnGenerateRegId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateRegIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGenerateRegId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioBtnMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnFemale)
                                        .addGap(14, 14, 14)
                                        .addComponent(radioBtnOther))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnWeightLoss)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnMuscleGain)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnShredding))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel23)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtOutStandingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel25)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtCCAccountHolder)))
                                            .addGap(16, 16, 16))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel26)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCreditCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtHeight))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 19, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerateRegId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnMale)
                    .addComponent(radioBtnFemale)
                    .addComponent(radioBtnOther))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnWeightLoss)
                    .addComponent(radioBtnMuscleGain)
                    .addComponent(radioBtnShredding))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOutStandingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCCAccountHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreditCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnOtherActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegNoActionPerformed
        int regId = gym.generateAutoRedIdForTrainer();
        txtRegNo.setText(String.valueOf(regId));
    }//GEN-LAST:event_txtRegNoActionPerformed

    private void radioBtnWeightLossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnWeightLossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnWeightLossActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void radioBtnMuscleGainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMuscleGainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMuscleGainActionPerformed

    private void txtGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGmailActionPerformed

    private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNoActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void radioBtnShreddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnShreddingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnShreddingActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String regId = txtRegNo.getText();
        String name = txtName.getText();
        String gmail = txtGmail.getText();
        String phoneNo = txtPhoneNo.getText();
        String address = txtAddress.getText();
        String dateJoin = listJoinDate.getSelectedValue();
        String monthJoin = listJoinMonth.getSelectedValue();
        String yearJoin = listJoinYear.getSelectedValue();
        String dateBirth = listBirthDate.getSelectedValue();
        String monthBirth = listBirthMonth.getSelectedValue();
        String yearBirth = listBirthYear.getSelectedValue();
        String height = txtHeight.getText();
        String weight = txtWeight.getText();
        String outStandingBalance = txtOutStandingBalance.getText();
        String creditCardAccountHolder = txtCCAccountHolder.getText();
        String creditCardNumber = txtCreditCardNumber.getText();
        if(!(regId.isEmpty() || name.isEmpty() || gmail.isEmpty() || phoneNo.isEmpty() || address.isEmpty() ||
            height.isEmpty()&& weight.isEmpty() || outStandingBalance.isEmpty() || creditCardAccountHolder.isEmpty() 
                || creditCardNumber.isEmpty())){
            if(member.validateName(name)){
                if(member.validateGmail(gmail)){
                    if(member.validatePhone(phoneNo)){
                        if(!(dateJoin.equals("Select") || monthJoin.equals("Select") || yearJoin.equals("Select"))){
                            if(!(dateBirth.equals("Select") || monthBirth.equals("Select") || yearBirth.equals("Select"))){
                                if(member.validateHeight(height)){
                                    if(member.validateWeight(weight)){
                                        if(payment.validateBalance(outStandingBalance)){
                                            if(payment.validateName(creditCardAccountHolder)){
                                                if(payment.validateCreditCard(creditCardNumber)){
                                                    int dateJoin1 = Integer.parseInt(dateJoin);
                                                    int monthJoin1 = Integer.parseInt(monthJoin);
                                                    int yearJoin1 = Integer.parseInt(yearJoin);
                                                    int dateBirth1 = Integer.parseInt(dateBirth);
                                                    int monthBirth1 = Integer.parseInt(monthBirth);
                                                    int yearBirth1 = Integer.parseInt(yearBirth);
                                                    int age = member.caluAge(yearBirth1);
                                                    if(date.checkDay(dateJoin1,monthJoin1) && date.checkDay(dateBirth1, monthBirth1)){
                                                        if(radioBtnFemale.isSelected() || radioBtnMale.isSelected() || radioBtnOther.isSelected()){
                                                            if(radioBtnShredding.isSelected() || radioBtnWeightLoss.isSelected() || radioBtnMuscleGain.isSelected()){
                                                                int regId1 = Integer.parseInt(regId);
                                                                double height1 = Double.parseDouble(height);
                                                                double weight1 = Double.parseDouble(weight);
                                                                double outstandingBalance1 = Double.parseDouble(outStandingBalance);
                                                                Date joinDate = new Date(monthJoin1, dateJoin1, yearJoin1);
                                                                Date birthDate = new Date(monthBirth1, dateBirth1, yearBirth1);
                                                                String gender = checkGender();
                                                                String fitnessGoal = checkFitnessGoal();
                                                                payment = new Payment(outstandingBalance1, creditCardAccountHolder, creditCardNumber);
                                                                member = new Member(regId1, name, gmail, phoneNo, address, joinDate, birthDate,age, gender, height1, weight1, payment, fitnessGoal);
                                                                gym.addMember(member);
                                                                JOptionPane.showMessageDialog(null, "Member information added");
                                                                txtRegNo.setText("");
                                                                txtName.setText("");
                                                                txtGmail.setText("");
                                                                txtPhoneNo.setText("");
                                                                txtAddress.setText("");
                                                                listJoinDate.setSelectedIndex(0);
                                                                listJoinMonth.setSelectedIndex(0);
                                                                listJoinYear.setSelectedIndex(0);
                                                                listBirthDate.setSelectedIndex(0);
                                                                listBirthMonth.setSelectedIndex(0);
                                                                listBirthYear.setSelectedIndex(0);
                                                                txtHeight.setText("");
                                                                txtWeight.setText("");
                                                                txtOutStandingBalance.setText("");
                                                                txtCCAccountHolder.setText("");
                                                                txtCreditCardNumber.setText("");
                                                                buttonGroup1.clearSelection();
                                                                buttonGroup2.clearSelection();
                                                            } else{
                                                                JOptionPane.showMessageDialog(null, "Choose fitness goal first before saving.");
                                                            }
                                                        }else{
                                                            JOptionPane.showMessageDialog(null, "Choose Gender first before saving.");
                                                        }
                                                    } else{
                                                        JOptionPane.showMessageDialog(null, "It seems like that date was not correct, select again.");
                                                    }
                                                }else{
                                                JOptionPane.showMessageDialog(null, "It seems like credit card number was not correct, enter again.");
                                                txtCreditCardNumber.setText("");
                                                }
                                            } else{
                                            JOptionPane.showMessageDialog(null, "It seems like credit card holder name was not correct, enter again.");
                                            txtCCAccountHolder.setText("");
                                            }
                                        } else{
                                            JOptionPane.showMessageDialog(null, "Balance should be consist positve number,enter again.");
                                            txtOutStandingBalance.setText("");
                                        } 
                                    } else{
                                        JOptionPane.showMessageDialog(null, "Weight should be in between 1-300, enter again.");
                                        txtWeight.setText("");
                                        }
                                    } else{
                                        JOptionPane.showMessageDialog(null, "Height should be in between 1-10, enter again.");
                                        txtHeight.setText("");
                                    }
                            } else{
                                JOptionPane.showMessageDialog(null, "Please select the correct date of birth.");
                            }
                        } else{
                            JOptionPane.showMessageDialog(null, "Please select the correct date of join.");
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "It seems like that phone no. is not correct, enter again.");
                        txtPhoneNo.setText("");
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "It seems like that gmail is not correct, enter again.");
                    txtGmail.setText("");
                }
            } else{
                JOptionPane.showMessageDialog(null, "It seems like that name is not correct, enter again.");
                txtName.setText("");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Enter data in all field first, then save.");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnGenerateRegIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateRegIdActionPerformed
        txtRegNoActionPerformed(evt);
    }//GEN-LAST:event_btnGenerateRegIdActionPerformed

    private void radioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMaleActionPerformed

    private void radioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnFemaleActionPerformed

    private void txtOutStandingBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOutStandingBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOutStandingBalanceActionPerformed

    private void txtCCAccountHolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCCAccountHolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCCAccountHolderActionPerformed

    private void txtCreditCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditCardNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditCardNumberActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        JFrameMemberMenu memberMenu = new JFrameMemberMenu();
        memberMenu.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed
    public String checkGender(){
        if(radioBtnMale.isSelected()){
            return "Male";
        } else if(radioBtnFemale.isSelected()){
            return "Female";
        }
        return "Other";
    }
    public String checkFitnessGoal(){
        if(radioBtnMuscleGain.isSelected()){
            return "Muscle gain";
        } else if(radioBtnShredding.isSelected()){
            return "Shredding";
        }
        return "Weight loss";
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAddMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateRegId;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList<String> listBirthDate;
    private javax.swing.JList<String> listBirthMonth;
    private javax.swing.JList<String> listBirthYear;
    private javax.swing.JList<String> listJoinDate;
    private javax.swing.JList<String> listJoinMonth;
    private javax.swing.JList<String> listJoinYear;
    private javax.swing.JRadioButton radioBtnFemale;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JRadioButton radioBtnMuscleGain;
    private javax.swing.JRadioButton radioBtnOther;
    private javax.swing.JRadioButton radioBtnShredding;
    private javax.swing.JRadioButton radioBtnWeightLoss;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCCAccountHolder;
    private javax.swing.JTextField txtCreditCardNumber;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOutStandingBalance;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
