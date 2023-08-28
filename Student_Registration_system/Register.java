package Register;
//import package 
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//class for swing
public class sam extends javax.swing.JFrame {

    
    public Register() {
        initComponents();
        table_update();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtroll = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RollNumber", "Name", "Course", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Register"));

        jLabel3.setText("Name");

        jLabel4.setText("Course");

        jLabel5.setText("Mobile");

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("RollNumber");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtmobile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcourse, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtname)
                            .addComponent(txtroll))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("STUDENT REGISTER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
//UPDATE button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        
        try {
       
        String RollNumber=txtroll.getText();
        String Name = txtname.getText();
        String Course = txtcourse.getText();
        String Mobile = txtmobile.getText();
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sam","root", "ramkumar@132");
            PreparedStatement insert = con1.prepareStatement("UPDATE student SET Name=?,Course=?,Mobile=? WHERE RollNumber=?" );
           
           
            insert.setString(1,Name);
            insert.setString(2,Course);
            insert.setString(3,Mobile);
            insert.setString(4,RollNumber);
            insert.executeUpdate();
             
            JOptionPane.showMessageDialog(this, "Record Updated");
            table_update();
             txtroll.setText("");
             txtname.setText("");
             txtcourse.setText("");
             txtmobile.setText("");
             txtname.requestFocus();
             
            
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found!");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }                                        
    //Code for update table   
    private void table_update()
    {
        int c;
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sam","root", "ramkumar@132");
            PreparedStatement insert=con1.prepareStatement("select * from student");
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData Rss=rs.getMetaData();
            c=Rss.getColumnCount();
            DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            while(rs.next()){
                Vector v2=new Vector();
                for(int a=1;a<=c;a++)
                {
                    v2.add(rs.getString("RollNumber"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Course"));
                    v2.add(rs.getString("Mobile"));
            
            }
                Df.addRow(v2);
        }
         }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found!");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
       
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String RollNumber=txtroll.getText();
        String Name=txtname.getText();
        String Course=txtcourse.getText();
        String Mobile=txtmobile.getText();
         
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sam","root", "ramkumar@132");
            PreparedStatement insert=con1.prepareStatement("INSERT INTO student(RollNumber,Name,Course,Mobile)values(?,?,?,?)");
            insert.setString(1,RollNumber);
            insert.setString(2,Name);
            insert.setString(3,Course);
            insert.setString(4,Mobile);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record added");
            table_update();
             txtroll.setText("");
             txtname.setText("");
             txtcourse.setText("");
             txtmobile.setText("");
             txtroll.requestFocus();
             
            
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found!");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }                                        
    //to display value in 
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
        int selectedindex=jTable1.getSelectedRow();
        txtroll.setText((String) Df.getValueAt(selectedindex,0));
        txtname.setText((String) Df.getValueAt(selectedindex,1));
        txtcourse.setText((String) Df.getValueAt(selectedindex,2));
        txtmobile.setText((String) Df.getValueAt(selectedindex,3));
    }                                    
    //DELETE button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int dialogResult=JOptionPane.showConfirmDialog(null, "Do you want to delete the Record","warning",JOptionPane.YES_NO_OPTION);
        if(dialogResult==JOptionPane.YES_OPTION)
        {
        try {
             DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
             int selectedindex=jTable1.getSelectedRow();
              String RollNumber=Df.getValueAt(selectedindex,0).toString();
   
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sam","root", "ramkumar@132");
            PreparedStatement insert=con1.prepareStatement("DELETE FROM student WHERE RollNumber=?");
            insert.setString(1,RollNumber);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted");
            table_update();
             
             txtname.setText("");
             txtcourse.setText("");
             txtmobile.setText("");
             txtname.requestFocus();
             
            
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found!");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }                                        
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new sam().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtroll;
    // End of variables declaration                   
}
