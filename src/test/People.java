package test;
// Clase de modelo de dominio

import java.util.ArrayList;
//import java.util.Iterator;
import javax.swing.JOptionPane;

public class People {

    private String valor_dire;
    private String valor_nombre;
    private String valor_apellido;
    private String valor_nacimiento;
    private String valor_profesion;
    private String valor_trabat;
    private String valor_empresa;
    private String valordos_tele;
    private String valortres_id;

    private ArrayList<String> lista_data_campos;
    private static People instancia;

    private People() {
    }

    public static People obtener_instancia_unica() {
        if (instancia == null) {
            synchronized (People.class) {
                if (instancia == null) {
                    instancia = new People();
                }
            }
        }

        return instancia;
    }

    public void añadir_datos(String valor_dire, String valor_nombre, String valor_apellido, String valor_nacimiento, String valor_profesion,
            String valor_trabat, String valor_empresa, String valordos_tele,
            String valortres_id, int valor_combo_estudio,
            int valor_combo_profesion, int valor_combo_edad, int valor_combo_estado) {

        lista_data_campos = new ArrayList<String>();
        lista_data_campos.add(valor_dire); // 0
        lista_data_campos.add(valor_nombre); // 1
        lista_data_campos.add(valor_apellido); // 2
        lista_data_campos.add(valor_nacimiento); // 3
        lista_data_campos.add(valor_profesion); // 4
        lista_data_campos.add(valor_trabat); // 5
        lista_data_campos.add(valor_empresa); // 6 
        lista_data_campos.add(valordos_tele); // 7
        lista_data_campos.add(valortres_id); // 8

        // Obtener selección del combo estudio
        if (valor_combo_estudio == 1) { // Primaria  
            lista_data_campos.add(String.valueOf(valor_combo_estudio));
        } else if (valor_combo_estudio == 2) {// Bachillerato 
            lista_data_campos.add(String.valueOf(valor_combo_estudio));
        } else if (valor_combo_estudio == 3) {// Técnic(a) 
            lista_data_campos.add(String.valueOf(valor_combo_estudio));
        } else if (valor_combo_estudio == 4) {  // Tecnologo
            lista_data_campos.add(String.valueOf(valor_combo_estudio));
        } else if (valor_combo_estudio == 5) {// Universitari(a)
            lista_data_campos.add(String.valueOf(valor_combo_estudio));
        } else if (valor_combo_estudio == 6) { // Especialización 
            lista_data_campos.add(String.valueOf(valor_combo_estudio));
        } else if (valor_combo_estudio == 7) {// Maestria 
            lista_data_campos.add(String.valueOf(valor_combo_estudio)); // Doctorado 
        } else if (valor_combo_estudio == 7) {// Doctorado 
            lista_data_campos.add(String.valueOf(valor_combo_estudio)); // Doctorado 
        }
        // Obtener selección del combo profesión
        if (valor_combo_profesion == 1) { //  1 año  
            lista_data_campos.add(String.valueOf(valor_combo_profesion));
        } else if (valor_combo_profesion == 2) {//   2 años
            lista_data_campos.add(String.valueOf(valor_combo_profesion));
        } else if (valor_combo_profesion == 3) {// 3 años 
            lista_data_campos.add(String.valueOf(valor_combo_profesion));
        } else if (valor_combo_profesion == 4) {  // 4 años
            lista_data_campos.add(String.valueOf(valor_combo_profesion));
        } else if (valor_combo_profesion == 5) {// 5  años
            lista_data_campos.add(String.valueOf(valor_combo_profesion));
        } else if (valor_combo_profesion == 6) { // 5+ años 
            lista_data_campos.add(String.valueOf(valor_combo_profesion));
        }
            // obtener seleccion del combo estado
        if (valor_combo_estado == 1) { // soltero 
            lista_data_campos.add(String.valueOf(valor_combo_estado));
        } else if (valor_combo_estado == 2) {//   casado
            lista_data_campos.add(String.valueOf(valor_combo_estado));
        }

    }
}
