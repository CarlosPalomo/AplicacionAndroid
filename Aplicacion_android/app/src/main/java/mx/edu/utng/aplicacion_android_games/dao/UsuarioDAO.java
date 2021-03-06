package mx.edu.utng.aplicacion_android_games.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import mx.edu.utng.aplicacion_android_games.model.Usuario;


/**
 * Creado por Juan Gabriel Carrillo Avalos.
 *
 * Este metodo agrega o moddifica los usuario de la base de datos.
 */
public interface UsuarioDAO {
    void agregar(Usuario usuario, SQLiteDatabase db);
    void modificar(Usuario usuario, SQLiteDatabase db);
    void eliminar(Usuario usuario, SQLiteDatabase db);
    Cursor listar(SQLiteDatabase db);
}
