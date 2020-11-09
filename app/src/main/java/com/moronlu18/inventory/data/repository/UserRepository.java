package com.moronlu18.inventory.data.repository;

import com.moronlu18.inventory.data.model.User;

/**
 * Esta clase será accesible desde cualquier punto de la aplicación.
 * Se accederá mediante el método estático getInstance() que devuelve
 * la instancia del repositorio que siempre se inicializa en un bloque
 * estático
 */
public class UserRepository {

    private static UserRepository repository;
    private User user;

    /**
     * Se inicializa las propiedades estáticas del repositorio
     * en el bloque static
     */
    static {
        repository=new UserRepository();
    }

    /*Constructor privado donde se inicializarán las variables de objeto*/
    private UserRepository() {
        user= new User(1,"lourdes","lourdes@iesportada.org","lourdes","lourdes");

    }

    public static UserRepository getInstance(){
        //No es necesario comprobar si es null, porque se ha inicializado
        //en el bloque static
        return  repository;
    }

}
