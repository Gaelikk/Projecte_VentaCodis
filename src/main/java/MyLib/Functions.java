package MyLib;

import model.Client;
import view.ViewSale;

public class Functions {
    public static boolean iniciar (Client client, ViewSale view){

        if (view.jtfUser.getText().equals(client.getUsername()) ){
            if (view.jtfPass.getText().equals(client.getPassword())){
                return true;
            }else{

                return false;
            }

        }else{
            return false;
        }

    }
}
