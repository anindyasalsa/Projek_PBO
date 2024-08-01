package Controller;

import DAO.DAOSignUp;
import DAOInterface.IDAORegist;
import Model.SignUp;
import View.Regist;
import View.Home; 
import javax.swing.JOptionPane;

public class ControllerRegist {
    Regist frmRegist;
    IDAORegist iRegist;

    public ControllerRegist(Regist frmRegist) 
    {
        this.frmRegist = frmRegist;
        iRegist = new DAOSignUp();
    }
                
    public void insert() 
    {
        String username = frmRegist.gettxtUsername().getText();
        String email = frmRegist.gettxtEmail().getText();
        String password = frmRegist.gettxtPassword().getText();
        String confirmPassword = frmRegist.gettxtConfirm_Password().getText();

        
        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Semua form harus diisi");
            return;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Password dan Konfirmasi Password tidak sesuai");
            // Clear password fields
            frmRegist.gettxtPassword().setText("");
            frmRegist.gettxtConfirm_Password().setText("");
            return;
        }

        SignUp b = new SignUp();
        b.setUsername(username);
        b.setEmail(email);
        b.setPassword(password);
        b.setConfirm_Password(confirmPassword);

        iRegist.insert(b);
        JOptionPane.showMessageDialog(null, "Registrasi Anda berhasil");

        Home home = new Home();
        home.setVisible(true);
        frmRegist.dispose();
    }
}
