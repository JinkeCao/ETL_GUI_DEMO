/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.datatransfer.Clipboard;

/**
 *
 * @author lenovo
 */
public class MyImageReader extends javax.swing.JFrame {

    File[] files;
    int num;

    /**
     * Creates new form MyImageReader
     */
    public MyImageReader() {
        initComponents();
        num = 0;
        Dimension scsize = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setMaximumSize(scsize);
        //this.setPreferredSize(scsize);
        //this.setMinimumSize(scsize);
        //this.doLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserDirectory = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonDirectory = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonPrev = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jRadioButtonAllImage = new javax.swing.JRadioButton();
        jRadioButtonAllScn = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButtonPrint = new javax.swing.JButton();
        jButtonCopy = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPaneImage = new javax.swing.JScrollPane();
        jLabelImage = new javax.swing.JLabel();

        jFileChooserDirectory.setDialogTitle("请选择图片文件夹");
        jFileChooserDirectory.setFileFilter(new FileNameExtensionFilter("图像文件","jpg","JPG","jpeg","JPEG",
            "bmp","BMP","WBMP","wbmp","gif","GIF"
        ));
        jFileChooserDirectory.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(50);

        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        jButtonDirectory.setText("文件夹");
        jButtonDirectory.setFocusable(false);
        jButtonDirectory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDirectory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDirectoryActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonDirectory);
        jToolBar1.add(jSeparator1);

        jButtonPrev.setText("前一个");
        jButtonPrev.setFocusable(false);
        jButtonPrev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPrev.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrevActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonPrev);

        jButtonNext.setText("后一个");
        jButtonNext.setFocusable(false);
        jButtonNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNext.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonNext);
        jToolBar1.add(jSeparator2);

        buttonGroup1.add(jRadioButtonAllImage);
        jRadioButtonAllImage.setText("全图");
        jRadioButtonAllImage.setFocusable(false);
        jRadioButtonAllImage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jRadioButtonAllImage.setMaximumSize(new java.awt.Dimension(60, 33));
        jRadioButtonAllImage.setMinimumSize(new java.awt.Dimension(60, 33));
        jRadioButtonAllImage.setPreferredSize(new java.awt.Dimension(60, 33));
        jRadioButtonAllImage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jRadioButtonAllImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAllImageActionPerformed(evt);
            }
        });
        jToolBar1.add(jRadioButtonAllImage);

        buttonGroup1.add(jRadioButtonAllScn);
        jRadioButtonAllScn.setText("全屏");
        jRadioButtonAllScn.setFocusable(false);
        jRadioButtonAllScn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jRadioButtonAllScn.setMaximumSize(new java.awt.Dimension(60, 33));
        jRadioButtonAllScn.setMinimumSize(new java.awt.Dimension(60, 33));
        jRadioButtonAllScn.setPreferredSize(new java.awt.Dimension(60, 33));
        jRadioButtonAllScn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jRadioButtonAllScn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAllScnActionPerformed(evt);
            }
        });
        jToolBar1.add(jRadioButtonAllScn);
        jToolBar1.add(jSeparator3);

        jButtonPrint.setText("打  印");
        jButtonPrint.setFocusable(false);
        jButtonPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPrint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonPrint);

        jButtonCopy.setText("复  制");
        jButtonCopy.setFocusable(false);
        jButtonCopy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCopy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopyActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonCopy);

        jButtonExit.setText("退  出");
        jButtonExit.setFocusable(false);
        jButtonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonExit);

        jSplitPane1.setLeftComponent(jToolBar1);

        jScrollPaneImage.setViewportView(jLabelImage);

        jSplitPane1.setRightComponent(jScrollPaneImage);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDirectoryActionPerformed
        // TODO add your handling code here:
        int op = jFileChooserDirectory.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            File dir = jFileChooserDirectory.getSelectedFile().getAbsoluteFile();
            files = dir.listFiles();
            num = 0;
            loadImage();
        }
    }//GEN-LAST:event_jButtonDirectoryActionPerformed

    private void jButtonPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrevActionPerformed
        // TODO add your handling code here:
        num--;
        if (num < 0) {
            num = files.length - 1;
        }
        if (jRadioButtonAllImage.isSelected()) {
            loadImage();
        } else if (jRadioButtonAllScn.isSelected()) {
            zoomImage();
        }
    }//GEN-LAST:event_jButtonPrevActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        num++;
        if (num > files.length - 1) {
            num = 0;
        }
        if (jRadioButtonAllImage.isSelected()) {
            loadImage();
        } else if (jRadioButtonAllScn.isSelected()) {
            zoomImage();
        }
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jRadioButtonAllImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAllImageActionPerformed
        // TODO add your handling code here:
        if (jRadioButtonAllImage.isSelected()) {
            loadImage();
        }
    }//GEN-LAST:event_jRadioButtonAllImageActionPerformed

    private void jRadioButtonAllScnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAllScnActionPerformed
        // TODO add your handling code here:
        if (jRadioButtonAllScn.isSelected()) {
            zoomImage();
        }
    }//GEN-LAST:event_jRadioButtonAllScnActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        // TODO add your handling code here:
        Toolkit kit = jLabelImage.getToolkit();
        if (kit != null) {
            // 获取工具箱自带的打印作业
            PrintJob printJob = kit.getPrintJob(this, "Print Frame", null);
            if (printJob != null) {
                Graphics pg = printJob.getGraphics();// 获取打印对象的图形环境
                if (pg != null) {
                    try {
                        jLabelImage.print(pg);// 打印标签及其上边的图像（图标）
                    } finally {
                        pg.dispose();// 注销图形环境
                    }
                }
                printJob.end();// 结束打印作业
            }
        }
        //jLabelImage.print(jLabelImage.getGraphics());
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButtonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopyActionPerformed
        // TODO add your handling code here:
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Image image = ((ImageIcon) jLabelImage.getIcon()).getImage();
        ImageTransferable trans = new ImageTransferable(image);
        clipboard.setContents(trans, null);
    }//GEN-LAST:event_jButtonCopyActionPerformed
    /*
    class MyClipOwner implements ClipboardOwner {

        @Override
        public void lostOwnership(Clipboard clip, Transferable contents) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
        }
        
    }
     */
    void zoomImage() {
        if (files[num] != null) {
            try {
                /*
                 ImageIcon image = new ImageIcon(files[num].getPath());
                 Dimension scsize = Toolkit.getDefaultToolkit().getScreenSize();
                 int width = (int) scsize.getWidth() - 10;
                 int height = (int) scsize.getHeight() - 48;
                 if (image.getIconWidth() > width - 10) {
                 image = new ImageIcon(image.getImage().getScaledInstance(width, -1, Image.SCALE_DEFAULT));
                 if (image.getIconHeight() - 48 > height) {
                 image = new ImageIcon(image.getImage().getScaledInstance(-1, height, Image.SCALE_DEFAULT));
                 }
                 }
                 jLabelImage.setIcon(image);
                 */
                BufferedImage bImage = ImageIO.read(files[num]);
                Image image = null;
                int width = bImage.getWidth();
                int height = bImage.getHeight();
                //Image image = bImage.getScaledInstance(width, height, Image.SCALE_DEFAULT);
                Dimension scsize = Toolkit.getDefaultToolkit().getScreenSize();
                int scwidth = (int) scsize.getWidth() - 10;
                int scheight = (int) scsize.getHeight() - 48;
                if (scwidth < width) {
                    image = bImage.getScaledInstance(scwidth, -1, Image.SCALE_DEFAULT);
                    height = image.getHeight(jLabelImage);
                    if (scheight - 48 < height) {
                        image = image.getScaledInstance(-1, scheight, Image.SCALE_DEFAULT);
                    }
                }
                jLabelImage.setIcon(new ImageIcon(image));
            } catch (IOException ex) {
                Logger.getLogger(MyImageReader.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "无图像文件", "你所选择的文件夹不包含可以显示的图像文件。请重新选择！", JOptionPane.WARNING_MESSAGE);
        }
    }

    BufferedImage loadImage() {
        BufferedImage image = null;
        if (files != null && files.length > 0 && files[num].getName().toLowerCase().endsWith(".jpg")) {
            try {
                image = ImageIO.read(files[num]);
                jLabelImage.setIcon(new ImageIcon(image));
                this.setTitle("正在看的图像是 " + files[num].getAbsolutePath());
                //num++;
            } catch (IOException ex) {
                Logger.getLogger(MyImageReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "无图像文件", "你所选择的文件夹不包含可以显示的图像文件。请重新选择！", JOptionPane.WARNING_MESSAGE);
        }
        return image;
    }

    public InputStream rotateImg(BufferedImage image, int degree, Color bgcolor) throws IOException {

        int iw = image.getWidth();//原始图象的宽度   
        int ih = image.getHeight();//原始图象的高度  
        int w = 0;
        int h = 0;
        int x = 0;
        int y = 0;
        degree = degree % 360;
        if (degree < 0) {
            degree = 360 + degree;//将角度转换到0-360度之间  
        }
        double ang = Math.toRadians(degree);//将角度转为弧度  

        /**
         * 确定旋转后的图象的高度和宽度
         */
        if (degree == 180 || degree == 0 || degree == 360) {
            w = iw;
            h = ih;
        } else if (degree == 90 || degree == 270) {
            w = ih;
            h = iw;
        } else {
            int d = iw + ih;
            w = (int) (d * Math.abs(Math.cos(ang)));
            h = (int) (d * Math.abs(Math.sin(ang)));
        }

        x = (w / 2) - (iw / 2);//确定原点坐标  
        y = (h / 2) - (ih / 2);
        BufferedImage rotatedImage = new BufferedImage(w, h, image.getType());
        Graphics2D gs = (Graphics2D) rotatedImage.getGraphics();
        if (bgcolor == null) {
            rotatedImage = gs.getDeviceConfiguration().createCompatibleImage(w, h, Transparency.TRANSLUCENT);
        } else {
            gs.setColor(bgcolor);
            gs.fillRect(0, 0, w, h);//以给定颜色绘制旋转后图片的背景  
        }

        AffineTransform at = new AffineTransform();
        at.rotate(ang, w / 2, h / 2);//旋转图象  
        at.translate(x, y);
        AffineTransformOp op = new AffineTransformOp(at, AffineTransformOp.TYPE_BICUBIC);
        op.filter(image, rotatedImage);
        image = rotatedImage;

        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ImageOutputStream iamgeOut = ImageIO.createImageOutputStream(byteOut);

        ImageIO.write(image, "png", iamgeOut);
        InputStream inputStream = new ByteArrayInputStream(byteOut.toByteArray());

        return inputStream;
    }

    class ImageTransferable implements Transferable {

        Image theImage;

        public ImageTransferable(Image theImage) {
            this.theImage = theImage;
        }

        @Override
        public DataFlavor[] getTransferDataFlavors() {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return new DataFlavor[]{DataFlavor.imageFlavor};
        }

        @Override
        public boolean isDataFlavorSupported(DataFlavor flavor) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return flavor.equals(DataFlavor.imageFlavor);
        }

        @Override
        public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if (flavor.equals(DataFlavor.imageFlavor)) {
                return theImage;
            } else {
                return new UnsupportedFlavorException(flavor);
            }
        }

    }

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
            java.util.logging.Logger.getLogger(MyImageReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyImageReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyImageReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyImageReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyImageReader().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCopy;
    private javax.swing.JButton jButtonDirectory;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonPrev;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JFileChooser jFileChooserDirectory;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JRadioButton jRadioButtonAllImage;
    private javax.swing.JRadioButton jRadioButtonAllScn;
    private javax.swing.JScrollPane jScrollPaneImage;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
