import javax.swing.JOptionPane;
public class BetygMaker {
    public static void main(String[] args) {
        String ask = JOptionPane.showInputDialog(null, "how many point");

        int points = Integer.parseInt(ask);

        if(points > 30 || points < 0){
            JOptionPane.showMessageDialog(null, "points invalid >:(");
        } else {
            if (points <= 14) {
                JOptionPane.showMessageDialog(null, "u done messed up");
            }else if(points > 15 && points < 18){
                JOptionPane.showMessageDialog(null, "E");
            } else if (points > 18 && points < 21) {
                JOptionPane.showMessageDialog(null, "D");
            } else if (points > 21 && points < 24) {
                JOptionPane.showMessageDialog(null, "C");
            } else if (points > 24 && points < 27) {
                JOptionPane.showMessageDialog(null, "B");
            } else if (points >= 27) {
                JOptionPane.showMessageDialog(null, "A");
            }
        }
    }

}