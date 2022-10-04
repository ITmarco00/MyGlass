package com.example.myglass;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/*public class ListAdapterShop extends ArrayAdapter<Occhiale> {

    public Toast messagOK, messagErr;

    public ListAdapterShop(Context context, Occhiale[] occhiale){

        super(context, R.layout.list_item_shop, occhiale);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_item_shop, null);



        messagOK =  Toast.makeText(getContext(), "Prodotto eliminato!", Toast.LENGTH_LONG);
        messagErr =  Toast.makeText(getContext(), "Ups! Qualcosa è andato storto :(!", Toast.LENGTH_LONG);

        AppCore a = new AppCore();
        ImageView imageView = convertView.findViewById(R.id.occ_img);
        TextView nome = convertView.findViewById(R.id.occ_nome);
        TextView descrizione = convertView.findViewById(R.id.occ_desc);
        TextView prezzo = convertView.findViewById(R.id.occ_prezzo);
        ListView listaElementi = convertView.findViewById(R.id.list_carrello);

        Occhiale occhiale = getItem(position);
        imageView.setImageResource(a.ReturnImgId(occhiale.percorso_immagine));
        nome.setText(occhiale.nome);
        descrizione.setText(occhiale.descrizione);
        prezzo.setText(Float.toString(occhiale.prezzo));

        ImageButton cestino = convertView.findViewById(R.id.cestino);
        cestino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("elemento eliminato " + occhiale.getOcchiale_id() );
                StringBuilder url = new StringBuilder("http://10.0.2.2:4444/deleteItem");
                url.append("?occhiale_id=");
                url.append(occhiale.getOcchiale_id());
                deleteItemFunction(url.toString());

                //prendo l'occhiale da eliminare
                Occhiale o = getItem(position);


                try{
                    ListAdapterShop.super.remove(o);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

                notifyDataSetChanged();
             //   notifyDataSetChanged();
                //adapter.remove(adapter.getItem(position));notifyDataSetChanged();




                //ListAdapterShop.super.remove(ListAdapterShop.super.getItem(position));

            }
        });
        return convertView;
    }

    public void deleteItemFunction(String url){
        OkHttpClient client= new OkHttpClient();
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                messagErr.show();
                System.out.println(e.getMessage());
                return;
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()){
                    String respo = response.body().string();
                    if(respo.equals("true")){
                        messagOK.show();

                       //getSupportFragmentManager().beginTransaction().replace(R.id.navHostFragment, new ShopFragment()).commit();
                        // startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                    }
                    else{
                        messagErr.show();
                    }
                    return;
                }
            }
        });

    }
}*/
