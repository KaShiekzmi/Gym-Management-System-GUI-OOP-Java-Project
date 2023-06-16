package project_oop;
import javax.swing.*;
public class JFrameAddTrainer extends javax.swing.JFrame {
    Trainer trainer = new Trainer();
    Gym gym = new Gym();
    Date date = new Date();
    public JFrameAddTrainer() {
        initComponents();
        txtRegNo.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        btnGroupGender = new javax.swing.ButtonGroup();
        btnGroupExperienceLvl = new javax.swing.ButtonGroup();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        txtPhoneNo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listJoinMonth = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listJoinYear = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listBirthDate = new javax.swing.JList<>();
        txtAddress = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listBirthMonth = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        radioBtnMale = new javax.swing.JRadioButton();
        radioBtnFemale = new javax.swing.JRadioButton();
        radioBtnOther = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        txtSpecialization = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listBirthYear = new javax.swing.JList<>();
        txtHourlyRate = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtWeeklyWorkingHour = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        radioBtnBeginner = new javax.swing.JRadioButton();
        radioBtnIntermediate = new javax.swing.JRadioButton();
        radioBtnAdvance = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnGenerateRegId = new javax.swing.JButton();
        txtRegNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listJoinDate = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtGmail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(35, 43, 42));

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

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Address:");

        listJoinMonth.setBackground(new java.awt.Color(35, 43, 42));
        listJoinMonth.setForeground(new java.awt.Color(255, 255, 255));
        listJoinMonth.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listJoinMonth.setSelectedIndex(0);
        jScrollPane2.setViewportView(listJoinMonth);

        listJoinYear.setBackground(new java.awt.Color(35, 43, 42));
        listJoinYear.setForeground(new java.awt.Color(255, 255, 255));
        listJoinYear.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Select", "2023", "2022", "2021", "2020", "2019", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listJoinYear.setSelectedIndex(0);
        jScrollPane3.setViewportView(listJoinYear);

        listBirthDate.setBackground(new java.awt.Color(35, 43, 42));
        listBirthDate.setForeground(new java.awt.Color(255, 255, 255));
        listBirthDate.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBirthDate.setSelectedIndex(0);
        jScrollPane4.setViewportView(listBirthDate);

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

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Date of join(MM-DD-YYYY):");

        listBirthMonth.setBackground(new java.awt.Color(35, 43, 42));
        listBirthMonth.setForeground(new java.awt.Color(255, 255, 255));
        listBirthMonth.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBirthMonth.setSelectedIndex(0);
        jScrollPane5.setViewportView(listBirthMonth);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Date of birth(MM-DD-YYYY):");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Gender:");

        btnGroupGender.add(radioBtnMale);
        radioBtnMale.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnMale.setText("Male");
        radioBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMaleActionPerformed(evt);
            }
        });

        btnGroupGender.add(radioBtnFemale);
        radioBtnFemale.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnFemale.setText("Female");
        radioBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnFemaleActionPerformed(evt);
            }
        });

        btnGroupGender.add(radioBtnOther);
        radioBtnOther.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnOther.setText("Other");
        radioBtnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnOtherActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Specialization:");

        txtSpecialization.setBackground(new java.awt.Color(35, 43, 42));
        txtSpecialization.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSpecialization.setForeground(new java.awt.Color(255, 255, 255));
        txtSpecialization.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtSpecialization.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecializationActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Hourly rate:");

        listBirthYear.setBackground(new java.awt.Color(35, 43, 42));
        listBirthYear.setForeground(new java.awt.Color(255, 255, 255));
        listBirthYear.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Select", "2023", "2022", "2021", "2020", "2019", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBirthYear.setSelectedIndex(0);
        jScrollPane6.setViewportView(listBirthYear);

        txtHourlyRate.setBackground(new java.awt.Color(35, 43, 42));
        txtHourlyRate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHourlyRate.setForeground(new java.awt.Color(255, 255, 255));
        txtHourlyRate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtHourlyRate.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtHourlyRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHourlyRateActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Weekly working hour:");

        txtWeeklyWorkingHour.setBackground(new java.awt.Color(35, 43, 42));
        txtWeeklyWorkingHour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWeeklyWorkingHour.setForeground(new java.awt.Color(255, 255, 255));
        txtWeeklyWorkingHour.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtWeeklyWorkingHour.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtWeeklyWorkingHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeeklyWorkingHourActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Experience level:");

        btnGroupExperienceLvl.add(radioBtnBeginner);
        radioBtnBeginner.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnBeginner.setText("Beginner");
        radioBtnBeginner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnBeginnerActionPerformed(evt);
            }
        });

        btnGroupExperienceLvl.add(radioBtnIntermediate);
        radioBtnIntermediate.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnIntermediate.setText("Intermediate");
        radioBtnIntermediate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIntermediateActionPerformed(evt);
            }
        });

        btnGroupExperienceLvl.add(radioBtnAdvance);
        radioBtnAdvance.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnAdvance.setText("Advance");
        radioBtnAdvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnAdvanceActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Trainer");

        btnSave.setBackground(new java.awt.Color(17, 122, 102));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Reg no.");

        btnGenerateRegId.setBackground(new java.awt.Color(17, 122, 102));
        btnGenerateRegId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGenerateRegId.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateRegId.setText("GENERATE NUMBER");
        btnGenerateRegId.setBorder(null);
        btnGenerateRegId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateRegIdActionPerformed(evt);
            }
        });

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

        listJoinDate.setBackground(new java.awt.Color(35, 43, 42));
        listJoinDate.setForeground(new java.awt.Color(255, 255, 255));
        listJoinDate.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listJoinDate.setSelectedIndex(0);
        jScrollPane1.setViewportView(listJoinDate);

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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Gmail:");

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

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Phone no(0000-0000000):");

        btnBack.setBackground(new java.awt.Color(17, 122, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(185, 185, 185))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerateRegId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWeeklyWorkingHour, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(radioBtnMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnFemale)
                        .addGap(14, 14, 14)
                        .addComponent(radioBtnOther))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnBeginner)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnIntermediate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnAdvance))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerateRegId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnMale)
                    .addComponent(radioBtnFemale)
                    .addComponent(radioBtnOther))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWeeklyWorkingHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnBeginner)
                    .addComponent(radioBtnIntermediate)
                    .addComponent(radioBtnAdvance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        radioBtnMale.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegNoActionPerformed
        int regId = gym.generateAutoRedIdForTrainer();
        txtRegNo.setText(String.valueOf(regId));
    }//GEN-LAST:event_txtRegNoActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGmailActionPerformed

    private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNoActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void radioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMaleActionPerformed

    private void radioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnFemaleActionPerformed

    private void radioBtnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnOtherActionPerformed

    private void txtSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecializationActionPerformed

    private void txtHourlyRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHourlyRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHourlyRateActionPerformed

    private void txtWeeklyWorkingHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeeklyWorkingHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeeklyWorkingHourActionPerformed

    private void radioBtnBeginnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnBeginnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnBeginnerActionPerformed

    private void radioBtnIntermediateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIntermediateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnIntermediateActionPerformed

    private void radioBtnAdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnAdvanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnAdvanceActionPerformed

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
        String specialization = txtSpecialization.getText();
        String hourlyRate = txtHourlyRate.getText();
        String weeklyWorkingHours = txtWeeklyWorkingHour.getText();
        if(!(regId.isEmpty() || name.isEmpty() || gmail.isEmpty() || phoneNo.isEmpty() || address.isEmpty() || 
                specialization.isEmpty()&& hourlyRate.isEmpty() || weeklyWorkingHours.isEmpty())){
            if(trainer.validateName(name)){
                if(trainer.validateGmail(gmail)){
                    if(trainer.validatePhone(phoneNo)){
                        if(!(dateJoin.equals("Select") || monthJoin.equals("Select") || yearJoin.equals("Select"))){
                            if(!(dateBirth.equals("Select") || monthBirth.equals("Select") || yearBirth.equals("Select"))){
                                if(trainer.validateHourlyRate(hourlyRate)){
                                    if(trainer.validateWeeklyWorkingHours(weeklyWorkingHours)){
                                        int dateJoin1 = Integer.parseInt(dateJoin);
                                        int monthJoin1 = Integer.parseInt(monthJoin);
                                        int yearJoin1 = Integer.parseInt(yearJoin);
                                        int dateBirth1 = Integer.parseInt(dateBirth);
                                        int monthBirth1 = Integer.parseInt(monthBirth);
                                        int yearBirth1 = Integer.parseInt(yearBirth);
                                        int age = trainer.caluAge(yearBirth1);
                                        if(date.checkDay(dateJoin1,monthJoin1) && date.checkDay(dateBirth1, monthBirth1)){
                                            if(radioBtnFemale.isSelected() || radioBtnMale.isSelected() || radioBtnOther.isSelected()){
                                                if(radioBtnAdvance.isSelected() || radioBtnBeginner.isSelected() || radioBtnIntermediate.isSelected()){
                                                    int regId1 = Integer.parseInt(regId);
                                                    double hourlyRate1 = Double.parseDouble(hourlyRate);
                                                    double weeklyWorkingHours1 = Double.parseDouble(weeklyWorkingHours);
                                                    Date joinDate = new Date(monthJoin1, dateJoin1, yearJoin1);
                                                    Date birthDate = new Date(monthBirth1, dateBirth1, yearBirth1);
                                                    String gender = checkGender();
                                                    String experienceLvl = checkExpereinceLvl();
                                                    trainer = new Trainer(regId1, name, gmail, phoneNo, address, joinDate, birthDate,age, gender, specialization, hourlyRate1, weeklyWorkingHours1, experienceLvl);
                                                    gym.addTrainer(trainer);
                                                    JOptionPane.showMessageDialog(null, "Trainer information added");
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
                                                    txtSpecialization.setText("");
                                                    txtHourlyRate.setText("");
                                                    txtWeeklyWorkingHour.setText("");
                                                    btnGroupExperienceLvl.clearSelection();
                                                    btnGroupGender.clearSelection();
                                                } else{
                                                    JOptionPane.showMessageDialog(null, "Choose Experience level first before saving.");
                                                }
                                            }else{
                                                JOptionPane.showMessageDialog(null, "Choose Gender first before saving.");
                                            }
                                        } else{
                                            JOptionPane.showMessageDialog(null, "It seems like that date was not correct, select again.");
                                        }
                                    } else{
                                        JOptionPane.showMessageDialog(null, "Weekly working hour should be in between 1-168, enter again.");
                                        txtWeeklyWorkingHour.setText("");
                                    }  
                                } else{
                                    JOptionPane.showMessageDialog(null, "It seems like hourly rate was wrong, enter again.");
                                    txtHourlyRate.setText("");
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
            JOptionPane.showMessageDialog(this, "Enter data in all field first, then save.");
        }
    }//GEN-LAST:event_btnSaveActionPerformed
   
    private void btnGenerateRegIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateRegIdActionPerformed
        txtRegNoActionPerformed(evt);
    }//GEN-LAST:event_btnGenerateRegIdActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       dispose();
       JFrameTrainerMenu trainerMenu = new JFrameTrainerMenu();
       trainerMenu.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed
    
    public String checkGender(){
        if(radioBtnMale.isSelected()){
            return "Male";
        } else if(radioBtnFemale.isSelected()){
            return "Female";
        }
        return "Other";
    }
    public String checkExpereinceLvl(){
        if(radioBtnBeginner.isSelected()){
            return "Beginner";
        } else if(radioBtnAdvance.isSelected()){
            return "Advance";
        }
        return "Intermediate";
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameAddTrainer().setVisible(true); 
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateRegId;
    private javax.swing.ButtonGroup btnGroupExperienceLvl;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JRadioButton radioBtnAdvance;
    private javax.swing.JRadioButton radioBtnBeginner;
    private javax.swing.JRadioButton radioBtnFemale;
    private javax.swing.JRadioButton radioBtnIntermediate;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JRadioButton radioBtnOther;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtHourlyRate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JTextField txtSpecialization;
    private javax.swing.JTextField txtWeeklyWorkingHour;
    // End of variables declaration//GEN-END:variables
}
