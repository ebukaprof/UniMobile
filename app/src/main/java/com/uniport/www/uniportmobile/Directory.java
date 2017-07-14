package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.DirectoryListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class Directory extends ActionBarActivity {
    ListView listView;
    private String [] nameOfLecturers =  {" Joseph A. Ajienka", " EthelbertChinaka Nduka "};
    private String [] emails = {"Email: info@uniport.ng.edu" ," Email: info@uniport.ng.edu"};
    private String [] phoneNumb = {"Tel:N/A ", "Tel:N/A "};
    private String [] designations = {"Vice Chancellor" , " Deputy Vice Chancellor"};
    private String [] departments = {"Department: Petroleum Engineering " ," Department: Mathematics"};
    private int [] lecturerImageId = {R.drawable.vcpix, R.drawable.dvcpix};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directory);

        DirectoryListAdapter directoryListAdapter = new DirectoryListAdapter(Directory.this,nameOfLecturers,emails,phoneNumb,designations,departments,lecturerImageId);
        listView = (ListView) findViewById(R.id.listViewDirectory);
        listView.setAdapter(directoryListAdapter);

    }
}
