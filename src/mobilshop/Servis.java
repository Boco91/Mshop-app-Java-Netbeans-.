/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilshop;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Boris
 */
public class Servis extends javax.swing.JFrame {

    /**
     * Creates new form Servis
     */
    public Servis() {
        initComponents();
        Toolkit toolkit=getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SERVISI LIST");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Ime i prezime:");

        jScrollPane1.setViewportView(jTextPane1);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Broj telefona:");

        jScrollPane2.setViewportView(jTextPane2);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Proizvodjac:");

        jComboBox1.setBackground(new java.awt.Color(153, 255, 153));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Iphone", "Samsung", "HTC", "Sony", "Huawei", "ZTE", "Microsoft", "Tesla" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Model:");

        jScrollPane3.setViewportView(jTextPane3);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("IMEI:");

        jScrollPane4.setViewportView(jTextPane4);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Opis kvara:");

        jScrollPane5.setViewportView(jTextPane5);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Opis popravke:");

        jScrollPane6.setViewportView(jTextPane6);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Cijena usluge:");

        jScrollPane7.setViewportView(jTextPane7);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("SACUVAJ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1)
                .addContainerGap(303, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(201, 201, 201))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Document dok=new Document();
            try {
                String nazivfajla = jTextPane1.getText().toString();
                if (nazivfajla==""){
                nazivfajla="Servis";
                }
                PdfWriter.getInstance(dok, new FileOutputStream("C:\\Users\\Boco\\Desktop\\MobilShop\\Servis\\" +nazivfajla+".pdf"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Prijem.class.getName()).log(Level.SEVERE, null, ex);
            }
            dok.open();
            
            PdfPTable tabela2 = new PdfPTable (2);
            tabela2.getDefaultCell().setFixedHeight(23f);
            tabela2.getDefaultCell().setBackgroundColor(new BaseColor(240,240,240));
            tabela2.setSpacingAfter(20f);
            PdfPTable tabelaHeader = new PdfPTable (2);
            tabelaHeader.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            tabelaHeader.setWidthPercentage(105f);
        
            
            
            try {
     
        

            String imageUrl = "https://image.ibb.co/ivHejF/smart_1.png";
            Image slika = Image.getInstance(new URL(imageUrl));
            slika.setAlignment(Element.ALIGN_LEFT);
            slika.scaleAbsolute(189f, 63f);
            //dok.add(slika);
            tabelaHeader.addCell(slika);
         

    } catch(Exception e){
      e.printStackTrace();
    }
            
            Font helv10 = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
        Font helv10bold = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
        Font helv12bold = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        
        
        Paragraph memorandum1 = new Paragraph();
        Chunk chunk1 = new Chunk("\n\nKralja Petra I Karadjordjevica", helv10bold);
        Chunk chunk2 = new Chunk("\n\nTnelefon: +387 66 737-269", helv10bold);
        Chunk chunk3 = new Chunk("\n\nE-mail: smartservisbl@gmail.com", helv10bold);
        Chunk chunk4 = new Chunk("\n\nFB: Smart servis Banja Luka", helv10bold);
        memorandum1.add(chunk1); memorandum1.add(chunk2);memorandum1.add(chunk3);memorandum1.add(chunk4);

        memorandum1.setAlignment(Element.ALIGN_RIGHT);
        
        PdfPCell memorandumCell = new PdfPCell(new Paragraph(memorandum1));
        memorandumCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        memorandumCell.setBorder(PdfPCell.NO_BORDER);
        memorandumCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        memorandumCell.setPaddingRight(15f);
        tabelaHeader.addCell(memorandumCell);
        //dok.add(memorandum1);
       
        
        LineSeparator ls = new LineSeparator();
        ls.setLineWidth(2);
        ls.setLineColor(new BaseColor(153, 153, 153));
        
        
            tabela2.addCell(new Phrase(jLabel2.getText().toString()));
            tabela2.addCell(new Phrase(jTextPane1.getText().toString()));
            tabela2.addCell(new Phrase(jLabel3.getText().toString()));
            tabela2.addCell(new Phrase(jTextPane2.getText().toString()));
            tabela2.addCell(new Phrase(jLabel4.getText().toString()));
            tabela2.addCell(new Phrase(jComboBox1.getSelectedItem().toString()));
            tabela2.addCell(new Phrase(jLabel5.getText().toString()));
            tabela2.addCell(new Phrase(jTextPane3.getText().toString()));
            tabela2.addCell(new Phrase(jLabel6.getText().toString()));
            tabela2.addCell(new Phrase(jTextPane4.getText().toString()));
            tabela2.addCell(new Phrase(jLabel9.getText().toString()));
            tabela2.addCell(new Phrase(jTextPane7.getText().toString()));
            
            Paragraph naslov = new Paragraph(jLabel1.getText().toString(), helv12bold);
            naslov.setAlignment(Element.ALIGN_CENTER);
            
            Paragraph prazanProstor = new Paragraph();
            prazanProstor.add(Chunk.NEWLINE);
            prazanProstor.add(Chunk.NEWLINE);
            
            dok.add(tabelaHeader);
            dok.add(new Chunk(ls));
            dok.add(new Paragraph(prazanProstor));
            dok.add(naslov);
            dok.add(Chunk.NEWLINE);
            dok.add(tabela2);
            dok.add(Chunk.NEWLINE);
            
            Paragraph opisKvara = new Paragraph("Opis kvara: \n\n", helv12bold);
            Paragraph opisPopravke = new Paragraph("Opis popravke: \n\n", helv12bold);
            Paragraph opisKvaratext = new Paragraph(jTextPane5.getText().toString() + "\n\n");
            Paragraph opisPopravketext = new Paragraph(jTextPane6.getText().toString() + "\n\n");
            opisKvara.setAlignment(Element.ALIGN_LEFT);
            opisPopravke.setAlignment(Element.ALIGN_LEFT);
            
            PdfPTable tabela3 = new PdfPTable (1);
            PdfPCell cell1 = new PdfPCell(new Paragraph(opisKvara));
            cell1.setBorder(PdfPCell.NO_BORDER);
            PdfPCell cell2 = new PdfPCell(new Paragraph(opisKvaratext));
            cell2.setFixedHeight(140f);
            PdfPCell cell3 = new PdfPCell(new Paragraph(opisPopravke));
            cell3.setBorder(PdfPCell.NO_BORDER);
            PdfPCell cell4 = new PdfPCell(new Paragraph(opisPopravketext));
            cell4.setFixedHeight(140f);
            
            tabela3.addCell(cell1);
            tabela3.addCell(cell2);
            tabela3.addCell(cell3);
            tabela3.addCell(cell4);
            
            
            dok.add(tabela3);
            dok.close();
            } catch (DocumentException ex) {
            Logger.getLogger(Prijem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.setVisible(false);
        Ulaz u=new Ulaz();
        u.setVisible(true);
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Servis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    // End of variables declaration//GEN-END:variables
}
