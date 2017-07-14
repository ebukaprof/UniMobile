package com.uniport.www.uniportmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import custom_nails_all.ThumbNailsAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class Library extends ActionBarActivity {

    ListView listViewThumbnails;
    String [] libHeaTex = {" Donald E. U. Ekong Library"};
    String [] libSubTex = {"To provide books, non-book/electronic resources and ancillary services which are invaluable in extending and supporting the university’s programmes of teaching, learning and Research."};
    int [] thumbsImg = {R.drawable.libuport};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);

        listViewThumbnails = (ListView) findViewById(R.id.listViewLib);
        ThumbNailsAdapter thumbNailsAdapter = new ThumbNailsAdapter(Library.this,libHeaTex,libSubTex,thumbsImg);
        listViewThumbnails.setAdapter(thumbNailsAdapter);
        listViewThumbnails.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                movetolib(position);
            }
        });
    }

    private void movetolib(int libb) {

        if(libb == 0){
            Intent intentlib = new Intent(Library.this,LibraryDetails.class);
            startActivity(intentlib);
        }
    }
}
