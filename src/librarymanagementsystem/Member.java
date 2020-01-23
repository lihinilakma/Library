/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;
 import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author R.M.A
 */
public class Member extends javax.swing.JFrame {
String memberid, fname, lname, addl1, addl2, city, occupation, gender, dob, joined_date, contactno, NICNO,Password;

   
    /**
     * Creates new form Member
     */
    public Member() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtmemberid = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtaddl1 = new javax.swing.JTextField();
        txtaddl2 = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        txtoccupation = new javax.swing.JTextField();
        txtcontactno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        rdbmale = new javax.swing.JRadioButton();
        rdbfemale = new javax.swing.JRadioButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel14 = new javax.swing.JLabel();
        txtnicno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtpw = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmember = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText(" Member Registration");

        txtmemberid.setText(" ");
        txtmemberid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmemberidMouseClicked(evt);
            }
        });
        txtmemberid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmemberidKeyPressed(evt);
            }
        });

        txtfname.setText(" ");

        txtlname.setText(" ");

        txtaddl1.setText(" ");

        txtaddl2.setText(" ");

        txtcity.setText(" ");

        txtoccupation.setText(" ");

        txtcontactno.setText(" ");

        jLabel2.setText("Member Id");

        jLabel3.setText(" First Name");

        jLabel4.setText("Last Name");

        jLabel5.setText("Address Line 1");

        jLabel6.setText("Address Line 2");

        jLabel7.setText("City");

        jLabel8.setText("DOB");

        jLabel9.setText("Occupation");

        jLabel10.setText("Gender");

        jLabel11.setText("Contact No");

        jLabel12.setText("Joined Date");

        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbmale);
        rdbmale.setText("Male");
        rdbmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbmaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbfemale);
        rdbfemale.setText("Female");

        jLabel14.setText(" ");

        txtnicno.setText(" ");

        jLabel13.setText("NIC No");

        jLabel15.setText("Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(rdbmale, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(rdbfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmemberid, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaddl1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaddl2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtoccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btninsert)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcontactno, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnupdate))
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btndelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(btnclear))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnicno, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(txtpw))))))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmemberid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel14)
                    .addComponent(txtcontactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtnicno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15)
                    .addComponent(txtpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtoccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbfemale)
                    .addComponent(rdbmale)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsert)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btnclear))
                .addGap(27, 27, 27))
        );

        tblmember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblmember);

        jButton5.setText("Exit");

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        if (this.txtfname.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null, "First Name cannot be black");
        }
       
       else if (this.txtmemberid.getText().isEmpty()==true)
       {
           JOptionPane.showMessageDialog(null, "Member id cannot be black");
       }
       
       else
       {
           
        memberid= this.txtmemberid.getText();
        fname = this.txtfname.getText();
        lname = this.txtlname.getText();
        addl1= this.txtaddl1.getText();
        addl2 = this.txtaddl2.getText();
        city = this.txtcity.getText();
        occupation = this.txtoccupation.getText();
        contactno = this.txtcontactno.getText();
        Password= this.txtpw.getText();
          
        NICNO = this.txtnicno.getText();
         
        
        SimpleDateFormat jd = new SimpleDateFormat("yyyy-MM-dd"); 
        joined_date = jd.format(this.jXDatePicker1.getDate());
        
        SimpleDateFormat db = new SimpleDateFormat("yyyy-MM-dd"); 
        dob = db.format(this.jXDatePicker2.getDate());
        
        
        if(this.rdbmale.isSelected()==true){
            gender = "Male";
        }else if(this.rdbfemale.isSelected()==true){
            gender = "Female";
        }else{
            gender = "null";
            JOptionPane.showMessageDialog(null, "Please Select Gender Option");
        }
        
        DBCon.DBConnection();
                
        {
      try{
            Statement st = DBCon.con.createStatement();
            st.executeUpdate("Insert into member values('"+memberid+"','"+fname+"','"+lname+"','"+addl1+"',"+ "'"+addl2+"','"+city+"','"+dob+"','"+occupation+"','"+gender+"','"+joined_date+"','"+NICNO+"','"+Password+"')");
            
             Statement st1 = DBCon.con.createStatement();
            st1.executeUpdate("Insert into mem_contact values('"+memberid+"','"+contactno+"')");
            
            JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
            ClearData();                       
            LoadTable(); 
            DBCon.con.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }                                         
       }
    
    }//GEN-LAST:event_btninsertActionPerformed

    private void rdbmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbmaleActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
          
         
        memberid= this.txtmemberid.getText();
        fname = this.txtfname.getText();
        lname = this.txtlname.getText();
        addl1= this.txtaddl1.getText();
        addl2 = this.txtaddl2.getText();
        city = this.txtcity.getText();
        occupation = this.txtoccupation.getText();
         contactno = this.txtcontactno.getText();
         NICNO = this.txtnicno.getText();
        Password = this.txtpw.getText();
        
        SimpleDateFormat jd = new SimpleDateFormat("yyyy-MM-dd"); 
        joined_date = jd.format(this.jXDatePicker1.getDate());
        
        SimpleDateFormat db = new SimpleDateFormat("yyyy-MM-dd"); 
        dob = db.format(this.jXDatePicker2.getDate());
        
            
        
        if(this.rdbmale.isSelected()==true){
            gender = "Male";
        }else if(this.rdbfemale.isSelected()==true){
            gender = "Female";
        }else{
            gender = "null";
            JOptionPane.showMessageDialog(null, "Please Select Gender Option");
        }
        
        DBCon.DBConnection();
                
        {
      try{
            Statement st = DBCon.con.createStatement();
            st.executeUpdate("UPDATE member SET  Mem_Fname='"+fname+"',Mem_Lname='"+lname+"', Mem_AddressL1='"+addl1+"',Mem_AddressL2='"+addl2+"',Mem_City='"+city+"',DOB='"+dob+"', Occupation='"+occupation+"',Gender='"+gender+"',Joined_date='"+joined_date+"',Mem_NICNo='"+NICNO+"',Password='"+Password+"' WHERE Mem_id='"+memberid+"'");
            
             Statement st1 = DBCon.con.createStatement();
   st1.executeUpdate("UPDATE mem_contact SET  Mem_ContactNo='"+contactno+"' WHERE Mem_id='"+memberid+"'");
            
            JOptionPane.showMessageDialog(null, "Data Updated Successfully");
             ClearData();
            LoadTable();
            DBCon.con.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        }
    
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtmemberidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmemberidKeyPressed
        // TODO add your handling code here:
       
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        
        memberid=this.txtmemberid.getText();
        
       
         
        String Query = ("SELECT *, Mem_ContactNo FROM member INNER JOIN mem_contact ON member.Mem_id = mem_contact.Mem_id WHERE member.Mem_id = '"+memberid+"'");
         
        
        DBCon.DBConnection();
        {
        try
        {
        Statement st = DBCon.con.createStatement();
        ResultSet rs = st.executeQuery(Query);
        while(rs.next())
        {
        this.txtfname.setText(rs.getString("Mem_Fname"));
        this.txtlname.setText(rs.getString("Mem_Lname"));
        this.txtaddl1.setText(rs.getString("Mem_AddressL1"));
        this.txtaddl2.setText(rs.getString("Mem_AddressL2"));
        this.txtcity.setText(rs.getString("Mem_City"));
        this.txtoccupation.setText(rs.getString("Occupation"));
        this.jXDatePicker1.setDate(rs.getDate("Joined_Date"));
        this.jXDatePicker2.setDate(rs.getDate("DOB"));
        this.txtcontactno.setText(rs.getString("Mem_ContactNo"));
        this.txtnicno.setText(rs.getString("Mem_NICNo")); 
        this.txtpw.setText(rs.getString("Password")); 
              
        
        if(rs.getString("Gender").equalsIgnoreCase("Male"))
        {
            this.rdbmale.setSelected(true);
        }
      else
        {
            this.rdbfemale.setSelected(true);
        }
        }
        
        LoadTable();  
        DBCon.con.close();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        }
        }
    }//GEN-LAST:event_txtmemberidKeyPressed

   
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        
        memberid = this.txtmemberid.getText();
         
        DBCon.DBConnection();
                
        {
      try{
            Statement st = DBCon.con.createStatement();
            st.executeUpdate("DELETE FROM member where Mem_id='"+memberid+"'");
            
            Statement st1 = DBCon.con.createStatement();
            st1.executeUpdate("DELETE FROM mem_contact where Mem_id='"+memberid+"'");
            
            JOptionPane.showMessageDialog(null, "Data deleted Successfully");
            ClearData();
            LoadTable(); 
            DBCon.con.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }                                         
         
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        
        ClearData();
}
    
      void ClearData(){
        this.txtmemberid.setText("");
        this.txtfname.setText("");
        this.txtlname.setText("");
        this.txtaddl1.setText("");
        this.txtaddl2.setText("");
        this.txtcity.setText("");
        this.txtpw.setText("");
        this.txtcontactno.setText("");
        this.jLabel14.setText("");
        this.txtoccupation.setText("");
        this.jXDatePicker1.setDate(null);
        this.jXDatePicker2.setDate(null);
        this.txtnicno.setText(""); 
        this.buttonGroup1.clearSelection();
    }                                        

     void LoadTable()
     {
      DefaultTableModel dm = new DefaultTableModel();
      dm.addColumn("Memberid");
      dm.addColumn("fname");
      dm.addColumn("lname");
      dm.addColumn("addl1");
      dm.addColumn("Addl2");
      dm.addColumn("city");
      dm.addColumn("dob");
      dm.addColumn("occupation");
      dm.addColumn("gender");
      dm.addColumn("joined_date");
      dm.addColumn("contactno");
      dm.addColumn("NICNO");
      dm.addColumn("Password");
      
      String Query= ("SELECT *, Mem_ContactNo FROM member INNER JOIN mem_contact ON member.Mem_id = mem_contact.Mem_id");
      DBCon.DBConnection();
      {
          try
          {
            Statement st=DBCon.con.prepareStatement(Query);
            ResultSet rs = st. executeQuery (Query);
            
            while (rs.next())
            {
                String memid = rs.getString("Mem_id");
                String fname = rs.getString("Mem_Fname");
                String lname = rs.getString("Mem_Lname");
                String addl1= rs.getString("Mem_AddressL1");
                String addl2 = rs.getString("Mem_AddressL2");
                String city = rs.getString("Mem_City");
                String dob = rs.getString("DOB");
                String occup = rs.getString("Occupation");
                String gen = rs.getString("Gender");
                String jid= rs.getString("Joined_Date");
                String conno = rs.getString("Mem_ContactNo");
                String nic = rs.getString("Mem_NICNo"); 
                String pw = rs.getString("Password"); 
                
                dm.addRow(new String[]{memid,fname,lname,addl1,addl2,city,dob,occup,gen,jid,conno,nic,pw});
            }
            this.tblmember.setModel(dm);
             
          }
           catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
          }
      }
    }//GEN-LAST:event_btnclearActionPerformed

     
    private void txtmemberidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmemberidMouseClicked
        // TODO add your handling code here:
       
         
        
    }//GEN-LAST:event_txtmemberidMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private javax.swing.JRadioButton rdbfemale;
    private javax.swing.JRadioButton rdbmale;
    private javax.swing.JTable tblmember;
    private javax.swing.JTextField txtaddl1;
    private javax.swing.JTextField txtaddl2;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcontactno;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmemberid;
    private javax.swing.JTextField txtnicno;
    private javax.swing.JTextField txtoccupation;
    private javax.swing.JTextField txtpw;
    // End of variables declaration//GEN-END:variables
}