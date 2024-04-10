import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame implements ActionListener {
    String muvelet = "";
    float fMuveletElott = 0;
    JButton gomb7;
    JButton gomb8;
    JButton gomb9;
    JButton gomb4;
    JButton gomb5;
    JButton gomb6;
    JButton gomb1;
    JButton gomb2;
    JButton gomb3;
    JButton gomb0;
    JButton gombplusz;
    JButton gombminusz;
    JButton gombx;
    JButton gombosztas;
    JButton gombegyenlo;
    JButton vissza;
    JButton CE;
    JButton pont;
    JButton gombhatvany;
    JButton gombgyok;
    JLabel label;

    public Frame() {
        JPanel panel = new JPanel(new GridBagLayout());
        label = new JLabel();
        label.setFont(new Font("Arial", Font.PLAIN, 36));
        gomb7 = new JButton("7");
        gomb7.addActionListener(this);
        gomb7.setFont(new Font("Arial", Font.PLAIN, 32));
        gomb7.setPreferredSize(new Dimension(80, 80));
        gomb8 = new JButton("8");
        gomb8.addActionListener(this);
        gomb8.setFont(new Font("Arial", Font.PLAIN, 32));
        gomb8.setPreferredSize(new Dimension(80, 80));
        gomb9 = new JButton("9");
        gomb9.addActionListener(this);
        gomb9.setFont(new Font("Arial", Font.PLAIN, 32));
        gomb9.setPreferredSize(new Dimension(80, 80));
        gomb4 = new JButton("4");
        gomb4.addActionListener(this);
        gomb4.setFont(new Font("Arial", Font.PLAIN, 32));
        gomb4.setPreferredSize(new Dimension(80, 80));
        gomb5 = new JButton("5");
        gomb5.addActionListener(this);
        gomb5.setFont(new Font("Arial", Font.PLAIN, 32));
        gomb5.setPreferredSize(new Dimension(80, 80));
        gomb6 = new JButton("6");
        gomb6.addActionListener(this);
        gomb6.setFont(new Font("Arial", Font.PLAIN, 32));
        gomb6.setPreferredSize(new Dimension(80, 80));
        gomb1 = new JButton("1");
        gomb1.addActionListener(this);
        gomb1.setFont(new Font("Arial", Font.PLAIN, 32));
        gomb1.setPreferredSize(new Dimension(80, 80));
        gomb2 = new JButton("2");
        gomb2.addActionListener(this);
        gomb2.setFont(new Font("Arial", Font.PLAIN, 32));
        gomb2.setPreferredSize(new Dimension(80, 80));
        gomb3 = new JButton("3");
        gomb3.addActionListener(this);
        gomb3.setFont(new Font("Arial", Font.PLAIN, 32));
        gomb3.setPreferredSize(new Dimension(80, 80));
        gomb0 = new JButton("0");
        gomb0.addActionListener(this);
        gomb0.setFont(new Font("Arial", Font.PLAIN, 32));
        gomb0.setPreferredSize(new Dimension(80, 80));
        gombplusz = new JButton("+");
        gombplusz.addActionListener(this);
        gombplusz.setFont(new Font("Arial", Font.PLAIN, 32));
        gombplusz.setPreferredSize(new Dimension(80, 80));
        gombminusz = new JButton("-");
        gombminusz.addActionListener(this);
        gombminusz.setFont(new Font("Arial", Font.PLAIN, 32));
        gombminusz.setPreferredSize(new Dimension(80, 80));
        gombx = new JButton("x");
        gombx.addActionListener(this);
        gombx.setFont(new Font("Arial", Font.PLAIN, 32));
        gombx.setPreferredSize(new Dimension(80, 80));
        gombosztas = new JButton("/");
        gombosztas.addActionListener(this);
        gombosztas.setFont(new Font("Arial", Font.PLAIN, 32));
        gombosztas.setPreferredSize(new Dimension(80, 80));
        gombhatvany = new JButton("^");
        gombhatvany.addActionListener(this);
        gombhatvany.setFont(new Font("Arial", Font.PLAIN, 32));
        gombhatvany.setPreferredSize(new Dimension(80, 80));
        gombgyok = new JButton("√");
        gombgyok.addActionListener(this);
        gombgyok.setFont(new Font("Arial", Font.PLAIN, 32));
        gombgyok.setPreferredSize(new Dimension(80, 80));
        gombegyenlo = new JButton("=");
        gombegyenlo.addActionListener(this);
        gombegyenlo.setFont(new Font("Arial", Font.PLAIN, 32));
        gombegyenlo.setPreferredSize(new Dimension(80, 80));
        vissza = new JButton("<-");
        vissza.addActionListener(this);
        vissza.setFont(new Font("Arial", Font.PLAIN, 32));
        vissza.setPreferredSize(new Dimension(80, 80));
        CE = new JButton("CE");
        CE.addActionListener(this);
        CE.setFont(new Font("Arial", Font.PLAIN, 32));
        CE.setPreferredSize(new Dimension(80, 80));
        pont = new JButton(".");
        pont.addActionListener(this);
        pont.setFont(new Font("Arial", Font.PLAIN, 32));
        pont.setPreferredSize(new Dimension(80, 80));
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 5;
        panel.add(label, c);
        c.gridwidth = 1;
        c.gridy = 1;
        c.gridx = 0;
        panel.add(gombgyok, c);
        c.gridx = 1;
        panel.add(CE, c);
        c.gridx = 2;
        panel.add(vissza, c);
        c.gridx = 3;
        panel.add(gombosztas, c);
        c.gridy = 2;
        c.gridx = 0;
        panel.add(gomb7, c);
        c.gridx = 1;
        panel.add(gomb8, c);
        c.gridx = 2;
        panel.add(gomb9, c);
        c.gridx = 3;
        panel.add(gombx, c);
        c.gridy = 3;
        c.gridx = 0;
        panel.add(gomb4, c);
        c.gridx = 1;
        panel.add(gomb5, c);
        c.gridx = 2;
        panel.add(gomb6, c);
        c.gridx = 3;
        panel.add(gombminusz, c);
        c.gridy = 4;
        c.gridx = 0;
        panel.add(gomb1, c);
        c.gridx = 1;
        panel.add(gomb2, c);
        c.gridx = 2;
        panel.add(gomb3, c);
        c.gridx = 3;
        panel.add(gombplusz, c);
        c.gridy = 5;
        c.gridx = 0;
        panel.add(gombhatvany, c);
        c.gridx = 1;
        panel.add(gomb0, c);
        c.gridx = 2;
        panel.add(pont, c);
        c.gridx = 3;
        panel.add(gombegyenlo, c);
        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gomb7) {
            label.setText(label.getText() + "7");
        } else if (e.getSource() == gomb8) {
            label.setText(label.getText() + "8");
        } else if (e.getSource() == gomb9) {
            label.setText(label.getText() + "9");
        } else if (e.getSource() == gomb4) {
            label.setText(label.getText() + "4");
        } else if (e.getSource() == gomb5) {
            label.setText(label.getText() + "5");
        } else if (e.getSource() == gomb6) {
            label.setText(label.getText() + "6");
        } else if (e.getSource() == gomb1) {
            label.setText(label.getText() + "1");
        } else if (e.getSource() == gomb2) {
            label.setText(label.getText() + "2");
        } else if (e.getSource() == gomb3) {
            label.setText(label.getText() + "3");
        } else if (e.getSource() == gomb0) {
            label.setText(label.getText() + "0");
        } else if (e.getSource() == gombplusz) {
            try {
                String muveletElott = label.getText();
                char elsoKarakter = muveletElott.charAt(0);
                String elsoKarakterStr = String.valueOf(elsoKarakter);
                if (elsoKarakterStr.equals("√")) {
                    String gyokStr = muveletElott.substring(1);
                    float fGyokStr = Float.parseFloat(gyokStr);
                    double eredmeny = Math.sqrt(fGyokStr);
                    fMuveletElott = (float) eredmeny;
                } else {
                    fMuveletElott = Float.parseFloat(muveletElott);
                }
                label.setText("");
                muvelet = "+";
            } catch (NumberFormatException e1) {
                label.setText("Érvénytelen!");
            } catch (StringIndexOutOfBoundsException e1) {
                label.setText("");
            }
        } else if (e.getSource() == gombx) {
            try {
                String muveletElott = label.getText();
                char elsoKarakter = muveletElott.charAt(0);
                String elsoKarakterStr = String.valueOf(elsoKarakter);
                if (elsoKarakterStr.equals("√")) {
                    String gyokStr = muveletElott.substring(1);
                    float fGyokStr = Float.parseFloat(gyokStr);
                    double eredmeny = Math.sqrt(fGyokStr);
                    fMuveletElott = (float) eredmeny;
                } else {
                    fMuveletElott = Float.parseFloat(muveletElott);
                }
                label.setText("");
                muvelet = "x";
            } catch (NumberFormatException e1) {
                label.setText("Érvénytelen!");
            } catch (StringIndexOutOfBoundsException e1) {
                label.setText("");
            }
        } else if (e.getSource() == gombminusz) {
            try {
                String muveletElott = label.getText();
                char elsoKarakter = muveletElott.charAt(0);
                String elsoKarakterStr = String.valueOf(elsoKarakter);
                if (elsoKarakterStr.equals("√")) {
                    String gyokStr = muveletElott.substring(1);
                    float fGyokStr = Float.parseFloat(gyokStr);
                    double eredmeny = Math.sqrt(fGyokStr);
                    fMuveletElott = (float) eredmeny;
                } else {
                    fMuveletElott = Float.parseFloat(muveletElott);
                }
                label.setText("");
                muvelet = "-";
            } catch (NumberFormatException e1) {
                label.setText("Érvénytelen!");
            } catch (StringIndexOutOfBoundsException e1) {
                label.setText("");
            }
        } else if (e.getSource() == gombosztas) {
            try {
                String muveletElott = label.getText();
                char elsoKarakter = muveletElott.charAt(0);
                String elsoKarakterStr = String.valueOf(elsoKarakter);
                if (elsoKarakterStr.equals("√")) {
                    String gyokStr = muveletElott.substring(1);
                    float fGyokStr = Float.parseFloat(gyokStr);
                    double eredmeny = Math.sqrt(fGyokStr);
                    fMuveletElott = (float) eredmeny;
                } else {
                    fMuveletElott = Float.parseFloat(muveletElott);
                }
                label.setText("");
                muvelet = "/";
            } catch (NumberFormatException e1) {
                label.setText("Érvénytelen!");
            } catch (StringIndexOutOfBoundsException e1) {
                label.setText("");
            }
        } else if (e.getSource() == gombhatvany) {
            try {
                String muveletElott = label.getText();
                char elsoKarakter = muveletElott.charAt(0);
                String elsoKarakterStr = String.valueOf(elsoKarakter);
                if (elsoKarakterStr.equals("√")) {
                    String gyokStr = muveletElott.substring(1);
                    float fGyokStr = Float.parseFloat(gyokStr);
                    double eredmeny = Math.sqrt(fGyokStr);
                    fMuveletElott = (float) eredmeny;
                } else {
                    fMuveletElott = Float.parseFloat(muveletElott);
                }
                label.setText("");
                muvelet = "^";
            } catch (NumberFormatException e1) {
                label.setText("Érvénytelen!");
            } catch (StringIndexOutOfBoundsException e1) {
                label.setText("");
            }
        } else if (e.getSource() == gombgyok) {
            try {
                String muveletElott = label.getText();
                fMuveletElott = Float.parseFloat(muveletElott);
                double eredmeny = Math.sqrt(fMuveletElott);
                label.setText(String.valueOf(eredmeny));
            } catch (NumberFormatException e1) {
                label.setText("√");
                muvelet = "√";
            }
        } else if (e.getSource() == gombegyenlo){
            String muveletUtan = label.getText();
            switch (muvelet) {
                case "+" -> {
                    float fMuveletUtan = Float.parseFloat(muveletUtan);
                    float eredmeny = fMuveletElott + fMuveletUtan;
                    label.setText(String.valueOf(eredmeny));
                }
                case "-" -> {
                    float fMuveletUtan = Float.parseFloat(muveletUtan);
                    float eredmeny = fMuveletElott - fMuveletUtan;
                    label.setText(String.valueOf(eredmeny));
                }
                case "x" -> {
                    float fMuveletUtan = Float.parseFloat(muveletUtan);
                    float eredmeny = fMuveletElott * fMuveletUtan;
                    label.setText(String.valueOf(eredmeny));
                }
                case "/" -> {
                    if (muveletUtan.equals("0")) {
                        label.setText("Nullával való osztás!");
                    } else {
                        float fMuveletUtan = Float.parseFloat(muveletUtan);
                        float eredmeny = fMuveletElott / fMuveletUtan;
                        label.setText(String.valueOf(eredmeny));
                    }
                }
                default -> {
                    label.setText("Adj meg egy műveletet!");
                    label.setFont(new Font("Arial", Font.PLAIN, 28));
                }
                case "^" -> {
                    float fMuveletUtan = Float.parseFloat(muveletUtan);
                    double eredmeny = Math.pow(fMuveletElott, fMuveletUtan);
                    label.setText(String.valueOf(eredmeny));
                }
                case "√" -> {
                    String gyokStr = muveletUtan.substring(1);
                    float fGyokStr = Float.parseFloat(gyokStr);
                    double eredmeny = Math.sqrt(fGyokStr);
                    label.setText(String.valueOf(eredmeny));
                }
            }
        } else if (e.getSource() == CE) {
            label.setText("");
        } else if (e.getSource() == vissza) {
            String eredetiSzoveg = label.getText();
            try {
                String helyettesSzoveg = eredetiSzoveg.substring(0, eredetiSzoveg.length() -1);
                label.setText(helyettesSzoveg);
            } catch (StringIndexOutOfBoundsException e1) {
                label.setText("");
            }
        } else if (e.getSource() == pont) {
            label.setText(label.getText() + ".");
        }
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setSize(new Dimension(400,700));
    }

}