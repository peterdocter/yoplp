package es.ait.yoplp.fileChooser;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.EditText;
import android.widget.ListView;

import es.ait.yoplp.R;


/**
 * Dialog to ask the name of the new folder when the new folder option it's pressed.
 */
public class NewFolderDialog extends DialogFragment
{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        super.onCreateDialog(savedInstanceState);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder = builder.setView(getActivity().getLayoutInflater().inflate(R.layout.fc_new_folder_dialog, null));
        builder = builder.setPositiveButton(R.string.button_ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                EditText text = (EditText) getActivity().findViewById(R.id.fcNewFolderEditText);
                if (text.getText() != null && !"".equals(text.getText().toString().trim())) {
                    ((FileChooserActivity) getActivity()).newFolder(text.getText().toString());
                }
                NewFolderDialog.this.getDialog().dismiss();
            }
        });
        builder = builder.setNegativeButton(R.string.button_cancel, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                NewFolderDialog.this.getDialog().cancel();
            }
        });

        return builder.create();
    }


}
