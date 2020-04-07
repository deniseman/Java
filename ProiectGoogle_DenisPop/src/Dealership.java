import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Dealership extends JFrame {
    private JLabel jcaiPutere=new JLabel("Cai Putere(min)");
    private JLabel jrataLunara=new JLabel("Rata lunara (max)");
    private JLabel janMinim=new JLabel("Anul fabricatiei (min)");
    private JLabel jautomataLabel=new JLabel("Cutie automata");
    private JLabel jKilometri=new JLabel("Numar KM(max)");
    private JLabel jMarca=new JLabel("Model");
    private JCheckBox jautomataCheckBox=new JCheckBox();
    private JTextField jCaiPutereField=new JTextField();
    private JTextField jrataLunaraField=new JTextField();
    private JTextField jKilometriField=new JTextField();
    private JTextField janMinimField=new JTextField();
    private JTextField jMarcaField=new JTextField();
    private JButton jFindButton=new JButton();
    private JButton jNextButton=new JButton();
    private JButton jBuyButton=new JButton();
    private JButton jResetButton=new JButton();
    private JTextArea jInformatiiTextArea=new JTextArea();
    private int count=0;
    private int suitables=0;

    private List<DaciaManufacture> daciaArrayList=new ArrayList<>();
    private List<DaciaManufacture> suitableDacias=new ArrayList<>();

    public Dealership(List<DaciaManufacture> daciaArrayList){
        this.daciaArrayList=daciaArrayList;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Dacia Dealership");
        this.setSize(450,280);
        this.setVisible(true);

        jMarca.setBounds(10,10,200,30);
        jautomataLabel.setBounds(10,40,200,30);
        jKilometri.setBounds(10,70,200,30);
        janMinim.setBounds(10,100,200,30);
        jcaiPutere.setBounds(10,130,200,30);
        jrataLunara.setBounds(10,160,200,30);
        add(jcaiPutere); add(jrataLunara); add(janMinim); add(jautomataLabel); add(jKilometri); add(jMarca);

        jautomataCheckBox.setBounds(130,40,50,30);
        jautomataCheckBox.setSelected(false);
        add(jautomataCheckBox);

        jMarcaField.setBounds(130,15,80,20);
        jKilometriField.setBounds(130,75,80,20);
        janMinimField.setBounds(130,105,80,20);
        jCaiPutereField.setBounds(130,135,80,20);
        jrataLunaraField.setBounds(130,165,80,20);
        add(jMarcaField); add(jKilometriField); add(janMinimField); add(jCaiPutereField); add(jrataLunaraField);

        jInformatiiTextArea.setBounds(220,10,200,175);
        add(jInformatiiTextArea);

        jFindButton.setText("FIND");
        jFindButton.setBounds(40,200,80,30);
        jFindButton.addActionListener(e -> {
            count=0;
            int good;
            this.suitables=0;
            for(DaciaManufacture dacia :daciaArrayList){
                good=1;
                if(dacia.getDaciaType().equalsIgnoreCase(jMarcaField.getText())) ;
                else good=0;

                boolean checkBox;
                if(jautomataCheckBox.isSelected()) checkBox=true;
                else checkBox=false;
                if(dacia.hasAutomaticGearbox()==checkBox) ;
                else good=0;

                if(dacia.getNumberOfKilometers()>Integer.parseInt(jKilometriField.getText())) good=0;

                if(dacia.getYearOfProduction()<Integer.parseInt(janMinimField.getText())) good=0;

                if(dacia.getHorsepower()>=Integer.parseInt(jCaiPutereField.getText())) ;
                else good=0;

                if(dacia.getmonthlyRate()<=Integer.parseInt(jrataLunaraField.getText())) ;
                else good=0;

                if(good!=0){
                    suitableDacias.add(suitables,dacia);
                    suitables++;
                }
            }
            System.out.println(suitables);
        });

        jNextButton.setText("NEXT");
        jNextButton.setBounds(140,200,80,30);
        jNextButton.addActionListener(e->{
            repaint();
            revalidate();
            jInformatiiTextArea.setText(null);

            if(count==suitables) {
                count=0;
            }

            if(this.suitables!=0){
                jInformatiiTextArea.append(suitableDacias.get(count).toString());
                count++;
            }
            else {
                jInformatiiTextArea.append("\nNu exista pe stoc!\n");
            }
        });

        jResetButton.setText("RESET");
        jResetButton.setBounds(240,200,80,30);

        jBuyButton.setText("BUY");
        jBuyButton.setBounds(340,200,80,30);
        add(jFindButton); add(jBuyButton); add(jResetButton); add(jNextButton);
    }
    private void countRead(){
        jInformatiiTextArea.append(suitableDacias.get(count).toString());
        this.repaint();
    }
}
