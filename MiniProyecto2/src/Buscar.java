

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Buscar extends javax.swing.JPanel {

    public Buscar(ArrayList<Dulce> listaDulces) {
        this.listaDulces = listaDulces;
        initComponents();
        if(listaDulces.isEmpty()){
            JOptionPane.showMessageDialog(jPanel1, "No se ha agregado ningun dulce.");
        }
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        araTexto = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(474, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblBuscar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        lblBuscar.setText("BUSCAR");

        lblNombre.setText("Ingrese el nombre del dulce:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Resultado de la busqueda:");

        araTexto.setEditable(false);
        araTexto.setColumns(20);
        araTexto.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        araTexto.setRows(5);
        jScrollPane1.setViewportView(araTexto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusqueda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(lblBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(btnBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 175, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblBuscar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtBusqueda.getText().length() == 0){
            JOptionPane.showMessageDialog(jPanel1, "Debe agregar un nombre para la busqueda.");
            return;
        }else{
            listarDulces();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void listarDulces(){
           araTexto.setText("");
            for(Dulce dulce: (ArrayList<Dulce>)listaDulces){
                if(dulce.getNombreDulce().toUpperCase().equals(txtBusqueda.getText().toUpperCase())){
                    araTexto.append("------------------------------------------------------------------------------------------------------------------------------\n");
                    araTexto.append(String.format("| %-15s |", "NOMBRE"));
                    araTexto.append(String.format(" %-15s |", "MARCA"));
                    araTexto.append(String.format(" %-15s |", "TIPO"));
                    araTexto.append(String.format(" %-50s |", "ETIQUETAS"));
                    araTexto.append(String.format(" %-15s |", "GRASA (%)"));
                    araTexto.append("\n");
                    araTexto.append("------------------------------------------------------------------------------------------------------------------------------\n");
                    araTexto.append(String.format("| %-15s |", dulce.getNombreDulce()));
                    araTexto.append(String.format(" %-15s |", dulce.getMarca()));
                    araTexto.append(String.format(" %-15s |", dulce.getTipoDulce()));
                    araTexto.append(String.format(" %-50s |", dulce.getEtiquetas()));
                    araTexto.append(String.format(" %-15s |\n", dulce.getPorcentajeGrasa()));
                    araTexto.append("------------------------------------------------------------------------------------------------------------------------------\n");
                    return;
                }        
            }
            araTexto.append("No existe ningun dulce con ese nombre.");
    }
    ArrayList<Dulce> listaDulces = new ArrayList<Dulce>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea araTexto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
