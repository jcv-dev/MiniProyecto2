

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Listar extends javax.swing.JPanel {

    public Listar(ArrayList<Dulce> listaDulces) {
        this.listaDulces = listaDulces;
        initComponents();
        listarDulces();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblListar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        scrTexto = new javax.swing.JScrollPane();
        araTexto = new javax.swing.JTextArea();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblListar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        lblListar.setText("LISTAR");

        araTexto.setEditable(false);
        araTexto.setColumns(20);
        araTexto.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        araTexto.setRows(5);
        scrTexto.setViewportView(araTexto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrTexto)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(lblListar)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void listarDulces(){
        if(listaDulces.isEmpty()){
            JOptionPane.showMessageDialog(jPanel1, "No se ha agregado ningun dulce.");
        }else{
            
            araTexto.append("------------------------------------------------------------------------------------------------------------------------------\n");
            araTexto.append(String.format("| %-15s |", "NOMBRE"));
            araTexto.append(String.format(" %-15s |", "MARCA"));
            araTexto.append(String.format(" %-15s |", "TIPO"));
            araTexto.append(String.format(" %-50s |", "ETIQUETAS"));
            araTexto.append(String.format(" %-15s |", "GRASA (%)"));
            araTexto.append("\n");
            araTexto.append("------------------------------------------------------------------------------------------------------------------------------\n");
            for(Dulce dulce: (ArrayList<Dulce>)listaDulces){
                araTexto.append(String.format("| %-15s |", dulce.getNombreDulce()));
                araTexto.append(String.format(" %-15s |", dulce.getMarca()));
                araTexto.append(String.format(" %-15s |", dulce.getTipoDulce()));
                araTexto.append(String.format(" %-50s |", dulce.getEtiquetas()));
                araTexto.append(String.format(" %-15s |\n", dulce.getPorcentajeGrasa()));
            }
            araTexto.append("------------------------------------------------------------------------------------------------------------------------------\n");
        }
    }
    
    ArrayList<Dulce> listaDulces = new ArrayList<Dulce>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea araTexto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblListar;
    private javax.swing.JScrollPane scrTexto;
    // End of variables declaration//GEN-END:variables
}
