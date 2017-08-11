package com.ifsc.mathe.appsimposiohumanidades;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InscricoesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link InscricoesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InscricoesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public WebView mWebView;

    private OnFragmentInteractionListener mListener;

    public InscricoesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InscricoesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InscricoesFragment newInstance(String param1, String param2) {
        InscricoesFragment fragment = new InscricoesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    private void mensagem(){
        AlertDialog.Builder mensagem = new AlertDialog.Builder(this.getActivity()).setTitle("Como realizar sua inscrição:");
        Spannable texto = new SpannableString("1. Localize a aba 'Cursos e Eventos localizados'.\n\n2. Dentro desta aba localize o II Simpósio de Humanidades IFSC Canoinhas.\n\n3.Clique na seta verde localizada no lado direito.\n\n4.Preencha o formulário de inscrição com seus dados.\n\n5. Pronto, voce já está inscrito no Simpósio.\n\nOBS: Lembre-se, você também deve se inscrever para todas as oficinas e palestras que deseja participar.\nAs palestras e oficinas do evento estarão localizadas na aba 'Mini Curso e Mini Eventos localizados\nAtente-se para o choque de horários das palestras e oficinas.'");
        texto.setSpan(new android.text.style.StyleSpan(Typeface.BOLD), 18, 48, 0);
        texto.setSpan(new ForegroundColorSpan(Color.BLUE), 18, 48, 0);
        texto.setSpan(new android.text.style.StyleSpan(Typeface.BOLD), 82, 126, 0);
        texto.setSpan(new ForegroundColorSpan(Color.BLUE), 82, 126, 0);
        texto.setSpan(new android.text.style.StyleSpan(Typeface.BOLD), 279, 545, 0);
        texto.setSpan(new ForegroundColorSpan(Color.BLUE), 279, 545, 0);
        mensagem.setMessage(texto);
        Spannable entendi = new SpannableString("Entendi");
        entendi.setSpan(new android.text.style.StyleSpan(Typeface.BOLD), 0, 7, 0);
        mensagem.setNeutralButton(entendi, null);
        mensagem.show();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        mensagem();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_inscricoes, container, false);
        mWebView = (WebView) v.findViewById(R.id.webview1);
        mWebView.loadUrl("https://sigaa.ifsc.edu.br/sigaa/link/public/extensao/inscricoesOnline"); // aqui podemos colocar a url das inscricoes
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);

        mWebView.setWebViewClient(new WebViewClient());

        return v;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
