package giubotta.com.acsipiemontebike;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ALTRO_Fragment extends Fragment {

    PDFView pdfView;

    public ALTRO_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate( R.layout.fragment_altro_, container, false );

        pdfView = (PDFView)v.findViewById(R.id.pdfView);

        pdfView.fromAsset("fci_piemonte.pdf").load();
        return v;
    }

}
