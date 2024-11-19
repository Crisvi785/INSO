package com.carvia.controllers;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.mindrot.jbcrypt.BCrypt;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.carvia.App;
import com.carvia.utils.AlertUtil;
/* 
 * 
 import com.carvia.Daos.UserDAO;
 import com.carvia.Entities.User;
 * 
*/

public class LoginController {

    private static final Logger logger = LogManager.getLogger(LoginController.class);

    // Campos vinculados al archivo Login.fxml
    @FXML
    private TextField usernameField; // ID en el FXML es "usernameField"
    @FXML
    private PasswordField passwordField; // ID en el FXML es "passwordField"

    // DAO para acceder a la base de datos
    //private UserDAO userDAO = new UserDAO();

    /**
     * Cambia la vista al formulario de registro.
     */
    @FXML
    private void switchToRegister() throws IOException {
        App.setRoot("register"); // Cambia la escena al registro
    }

    /**
     * Maneja el inicio de sesión del usuario.
     */
    @FXML
    private void login() throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        logger.info("Intento de inicio de sesión para el usuario: " + username);

        // Verifica si la entrada es sospechosa
        if (isInputSuspicious(username) || isInputSuspicious(password)) {
            logger.warn("Entrada sospechosa detectada");
            AlertUtil.showAlert("Advertencia", "Entrada inválida detectada", usernameField.getScene().getWindow());
            return;
        }
    }
        // Obtiene el usuario de la base de datos
       // User user = userDAO.getUserByUsername(username);
/*
 * 
 * 
 // Verifica credenciales
 if (user != null && BCrypt.checkpw(password, user.getPassword())) {
     logger.info("Inicio de sesión exitoso para el usuario: " + username);
     App.setRoot("planificador"); // Cambia la escena al "planificador"
 } else {
     logger.warn("Inicio de sesión fallido: Usuario o contraseña incorrectos");
     AlertUtil.showAlert("Error", "Usuario o contraseña incorrectos", usernameField.getScene().getWindow());
 }
}
 * 
 * 
 */

    /**
     * Comprueba si la entrada contiene caracteres sospechosos.
     *
     * @param input Cadena de texto para analizar.
     * @return Verdadero si la entrada es sospechosa, falso en caso contrario.
     */
    private boolean isInputSuspicious(String input) {
        String suspiciousPattern = ".*[;''\"<>|].*";
        return input.matches(suspiciousPattern);
    }
    
}
