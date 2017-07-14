package com.uniport.www.uniportmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/16/2015.
 */
public class HistoryOfUni extends ActionBarActivity {
    ListView viewHistory;
    String [] stringHistory = {"The University Of Port Harcourt","Mission and Vision Statement","The University Anthem",
                                 "The University Strategic Plan", "Alumina Association", "Past Vice Chancellors", "Professor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_uni);

        AllCustomListAdapter listAdapter22 = new AllCustomListAdapter(HistoryOfUni.this,stringHistory);
        viewHistory = (ListView) findViewById(R.id.listView_history);
        viewHistory.setAdapter(listAdapter22);
        viewHistory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                positionVote(position);
            }
        });

    }

    private void positionVote(int histor123) {

        if (histor123 == 0){

            Intent history1 = new Intent(HistoryOfUni.this, OfPortHarcourt.class);
            startActivity(history1);
        }

        if (histor123 == 1){

            Intent history12 = new Intent(HistoryOfUni.this, Mission.class);
            startActivity(history12);

        }

        if (histor123 == 2){

            Intent history123 = new Intent(HistoryOfUni.this, Anthem.class);
            startActivity(history123);

        }

    }
}
