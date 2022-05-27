package com.teamproject.doodlz;

import android.app.AlertDialog;
import android.content.DialogInterface;

public class CleanerDialog
{
    public void showDialog(final MainActivity activity)
    {
        //hola
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        builder.setMessage("¿Estás seguro de que quieres eliminar tu increíble imagen?").setTitle("Limpiar Pantalla");
        builder.setPositiveButton("Limpiar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.clearDrawing();
            }
        });
        builder.setNegativeButton("Volver", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                return;
            }
        });

        builder.show();
    }
}
