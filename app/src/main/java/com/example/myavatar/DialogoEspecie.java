package com.example.myavatar;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Spinner;
import androidx.fragment.app.DialogFragment;

public class DialogoEspecie extends DialogFragment
{
    MetodosDialogos listener;
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialogo_especie, null);
        builder.setView(view);
        builder.setTitle(getString(R.string.dialogoEspecie)).setPositiveButton(getString(R.string.guardar), new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int i)
            {
                Spinner spinner = view.findViewById(R.id.spinnerEspecie);
                String especie = spinner.getSelectedItem().toString();
                listener.EnviarEspecie(especie);
                dialog.dismiss();
            }
        }).setNegativeButton(getString(R.string.cancelar), new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int i)
            {
                dialog.dismiss();
            }
        });
        return builder.create();
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        if (context instanceof MetodosDialogos)
        {
            listener = (MetodosDialogos) context;
        }
        else
        {
            throw new RuntimeException(context.toString() + " debe implementar MetodosDialogos");
        }
    }
}
