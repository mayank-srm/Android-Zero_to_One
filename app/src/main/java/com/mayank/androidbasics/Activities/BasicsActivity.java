package com.mayank.androidbasics.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mayank.androidbasics.Adapters.BasicsAdapter;
import com.mayank.androidbasics.Data_Handling.Home_list_data;
import com.mayank.androidbasics.R;

public class BasicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);


        Home_list_data[] myListData = new Home_list_data[] {
                new Home_list_data("A user interface element that displays text to the user. ","TextView",
                        "public class MainActivity extends Activity {\n" +
                                "\n" +
                                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                                "         super.onCreate(savedInstanceState);\n" +
                                "         setContentView(R.layout.activity_main);\n" +
                                "         final TextView helloTextView = findViewById(R.id.text_view_id);\n" +
                                "         helloTextView.setText(R.string.user_greeting);\n" +
                                "     }\n" +
                                " }\n",
                        " <LinearLayout\n" +
                                "      xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                "      android:layout_width=\"match_parent\"\n" +
                                "      android:layout_height=\"match_parent\">\n" +
                                "    <TextView\n" +
                                "        android:id=\"@+id/text_view_id\"\n" +
                                "        android:layout_height=\"wrap_content\"\n" +
                                "        android:layout_width=\"wrap_content\"\n" +
                                "        android:text=\"@string/hello\" />\n" +
                                " </LinearLayout>>"),
                new Home_list_data("This is the EditText","Edit text","hughdj","jsghsj"),
                new Home_list_data("Testing purpose","testing","hughdj","jsghsj")
        };

        RecyclerView recyclerView = findViewById(R.id.basics_recycleView);
        BasicsAdapter adapter = new BasicsAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}
