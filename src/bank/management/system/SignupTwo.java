package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, vcategory, occupation, education, income;
    String formno;
    
    SignupTwo(String formno)
    {
        this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
           
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel s_category = new JLabel("Category:");
        s_category.setFont(new Font("Raleway", Font.BOLD, 20));
        s_category.setBounds(100, 190, 200, 30);
        add(s_category);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        vcategory = new JComboBox(valCategory);
        vcategory.setBounds(300, 190, 400, 30);
        vcategory.setBackground(Color.WHITE);
        add(vcategory);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String valIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        String educationValues[] = {"Non-Graduation", "Graducate", "Post-Graduation", "Doctrate", "others"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);        
        
        JLabel occ = new JLabel("Occupation:");
        occ.setFont(new Font("Raleway", Font.BOLD, 20));
        occ.setBounds(100, 390, 200, 30);
        add(occ);
        
        String occupationValues[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);  
          
        JLabel pannum = new JLabel("PAN Number:");
        pannum.setFont(new Font("Raleway", Font.BOLD, 20));
        pannum.setBounds(100, 440, 200, 30);
        add(pannum);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        JLabel aadharnum = new JLabel("Aadhar Number:");
        aadharnum.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharnum.setBounds(100, 490, 200, 30);
        add(aadharnum);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30);
        add(senior);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno= new JRadioButton("No");
        sno.setBounds(450, 540, 120, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
             
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        JLabel existing = new JLabel("Existing Account:");
        existing.setFont(new Font("Raleway", Font.BOLD, 20));
        existing.setBounds(100, 590, 200, 30);
        add(existing);
       
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno= new JRadioButton("No");
        eno.setBounds(450, 590, 120, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
             
        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font ("Raleway", Font.BOLD, 14 ));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        //String formno= "" + random;
        String s_religion= (String)religion.getSelectedItem();
        String s_category= (String)vcategory.getSelectedItem();
        String s_income= (String)income.getSelectedItem();
        String s_education= (String)education.getSelectedItem();
        String s_occupation= (String)occupation.getSelectedItem();

        String seniorcitizen=null;
        if(syes.isSelected())
        {
            seniorcitizen="Yes";
        }
        else if(sno.isSelected())
        {
            seniorcitizen="No";
        }
        String existingaccount=null;
         if(eyes.isSelected())
        {
            existingaccount="Yes";
        }
        else if(eno.isSelected())
        {
            existingaccount="No";
        }
      
        String span= pan.getText();
        String saadhar= aadhar.getText();
        
        try{
            
            Conn c = new Conn();
            String query = "insert into signuptwo values ('"+formno+"', '"+s_religion+"', '"+s_category+"', '"+s_income+"', '"+s_education+"', '"+s_occupation+"', '"+existingaccount+"', '"+span+"', '"+saadhar+"')";
            c.s.executeUpdate(query);
            
            //signup 3 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        } catch (Exception e)
        {
            System.out.println(e);
        }

        
        
    }
    
    
    public static void main(String[] args) {
        new SignupTwo("");
    }   
}
