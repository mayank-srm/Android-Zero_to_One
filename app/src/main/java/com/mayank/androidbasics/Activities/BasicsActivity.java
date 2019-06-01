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


                // TextView data
                new Home_list_data(
                        "TextView",
                        "A user interface element that displays text to the user. ",
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


                // EditText data
                new Home_list_data(
                        "EditText",
                        "A user interface element for entering and modifying text. When you define an edit text widget, you must specify the R.styleable.TextView_inputType attribute. ",
                        "public class MainActivity extends Activity {\n" +
                                "\n" +
                                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                                "         super.onCreate(savedInstanceState);\n" +
                                "         setContentView(R.layout.activity_main);\n" +
                                "         final TextView helloTextView = findViewById(R.id.text_view_id);\n" +
                                "         helloTextView.setText(R.string.user_greeting);\n" +
                                "     }\n" +
                                " }\n",
                        " <EditText\n" +
                                "     android:id=\"@+id/plain_text_input\"\n" +
                                "     android:layout_height=\"wrap_content\"\n" +
                                "     android:layout_width=\"match_parent\"\n" +
                                "     android:inputType=\"text\"/>"),


                new Home_list_data(
                        "ImageView",
                        "ImageView is commonly used to displaying an image and handle image scaling",
                        "public class MainActivity extends Activity {\n" +
                                "\n" +
                                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                                "         super.onCreate(savedInstanceState);\n" +
                                "         setContentView(R.layout.activity_main);\n" +
                                "         final TextView helloTextView = findViewById(R.id.text_view_id);\n" +
                                "         helloTextView.setText(R.string.user_greeting);\n" +
                                "     }\n" +
                                " }\n",
                        "<LinearLayout\n" +
                                "     xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                "     android:layout_width=\"match_parent\"\n" +
                                "     android:layout_height=\"match_parent\">\n" +
                                "     <ImageView\n" +
                                "         android:layout_width=\"wrap_content\"\n" +
                                "         android:layout_height=\"wrap_content\"\n" +
                                "         android:src=\"@mipmap/ic_launcher\"\n" +
                                "         />\n" +
                                " </LinearLayout>\n" +
                                " "),

                new Home_list_data(
                        "Button",
                        "A user interface element the user can tap or click to perform an action.",
                        " public class MyActivity extends Activity {\n" +
                                "     protected void onCreate(Bundle savedInstanceState) {\n" +
                                "         super.onCreate(savedInstanceState);\n" +
                                "\n" +
                                "         setContentView(R.layout.content_layout_id);\n" +
                                "\n" +
                                "         final Button button = findViewById(R.id.button_id);\n" +
                                "         button.setOnClickListener(new View.OnClickListener() {\n" +
                                "             public void onClick(View v) {\n" +
                                "                 // Code here executes on main thread after user presses button\n" +
                                "             }\n" +
                                "         });\n" +
                                "     }\n" +
                                " }",
                        " <Button\n" +
                                "     android:id=\"@+id/button_id\"\n" +
                                "     android:layout_height=\"wrap_content\"\n" +
                                "     android:layout_width=\"wrap_content\"\n" +
                                "     android:text=\"@string/self_destruct\" />"
                ),


                new Home_list_data(
                        "Radio Button",
                        "Radio buttons allow the user to select one option from a set. You should use radio buttons for optional sets that are mutually exclusive if you think that the user needs to see all available options side-by-side. ",
                        "public void onRadioButtonClicked(View view) {\n" +
                                "    // Is the button now checked?\n" +
                                "    boolean checked = ((RadioButton) view).isChecked();\n" +
                                "\n" +
                                "    // Check which radio button was clicked\n" +
                                "    switch(view.getId()) {\n" +
                                "        case R.id.radio_pirates:\n" +
                                "            if (checked)\n" +
                                "                // Pirates are the best\n" +
                                "            break;\n" +
                                "        case R.id.radio_ninjas:\n" +
                                "            if (checked)\n" +
                                "                // Ninjas rule\n" +
                                "            break;\n" +
                                "    }\n" +
                                "}",
                        "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                                "<RadioGroup xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                "    android:layout_width=\"match_parent\"\n" +
                                "    android:layout_height=\"wrap_content\"\n" +
                                "    android:orientation=\"vertical\">\n" +
                                "    <RadioButton android:id=\"@+id/radio_pirates\"\n" +
                                "        android:layout_width=\"wrap_content\"\n" +
                                "        android:layout_height=\"wrap_content\"\n" +
                                "        android:text=\"@string/pirates\"\n" +
                                "        android:onClick=\"onRadioButtonClicked\"/>\n" +
                                "    <RadioButton android:id=\"@+id/radio_ninjas\"\n" +
                                "        android:layout_width=\"wrap_content\"\n" +
                                "        android:layout_height=\"wrap_content\"\n" +
                                "        android:text=\"@string/ninjas\"\n" +
                                "        android:onClick=\"onRadioButtonClicked\"/>\n" +
                                "</RadioGroup>"
                ),


                new Home_list_data(
                        "CheckBox",
                        "Checkboxes allow the user to select one or more options from a set. Typically, you should present each checkbox option in a vertical list.",
                        "public void onCheckboxClicked(View view) {\n" +
                                "    // Is the view now checked?\n" +
                                "    boolean checked = ((CheckBox) view).isChecked();\n" +
                                "\n" +
                                "    // Check which checkbox was clicked\n" +
                                "    switch(view.getId()) {\n" +
                                "        case R.id.checkbox_meat:\n" +
                                "            if (checked)\n" +
                                "                // Put some meat on the sandwich\n" +
                                "            else\n" +
                                "                // Remove the meat\n" +
                                "            break;\n" +
                                "        case R.id.checkbox_cheese:\n" +
                                "            if (checked)\n" +
                                "                // Cheese me\n" +
                                "            else\n" +
                                "                // I'm lactose intolerant\n" +
                                "            break;\n" +
                                "        // TODO: Veggie sandwich\n" +
                                "    }\n" +
                                "}",
                        "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                "    android:orientation=\"vertical\"\n" +
                                "    android:layout_width=\"fill_parent\"\n" +
                                "    android:layout_height=\"fill_parent\">\n" +
                                "    <CheckBox android:id=\"@+id/checkbox_meat\"\n" +
                                "        android:layout_width=\"wrap_content\"\n" +
                                "        android:layout_height=\"wrap_content\"\n" +
                                "        android:text=\"@string/meat\"\n" +
                                "        android:onClick=\"onCheckboxClicked\"/>\n" +
                                "    <CheckBox android:id=\"@+id/checkbox_cheese\"\n" +
                                "        android:layout_width=\"wrap_content\"\n" +
                                "        android:layout_height=\"wrap_content\"\n" +
                                "        android:text=\"@string/cheese\"\n" +
                                "        android:onClick=\"onCheckboxClicked\"/>\n" +
                                "</LinearLayout>"
                ),

                new Home_list_data(
                        "ToolTip",
                        "A tooltip is a small descriptive message that appears near a view when users long press the view or hover their mouse over it. This is useful when your app uses an icon to represent an action or piece of information to save space in the layout.",
                        "FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);\n" +
                                "fab.setTooltipText(\"Send an email\");",
                        "<android.support.design.widget.FloatingActionButton\n" +
                                "        android:id=\"@+id/fab\"\n" +
                                "        android:tooltipText=\"Send an email\" />"
                ),


                new Home_list_data(
                        "Toasts",
                        "A toast provides simple feedback about an operation in a small popup. It only fills the amount of space required for the message and the current activity remains visible and interactive. Toasts automatically disappear after a timeout.\n\nyou can use this predefined toast or u  can make ur custom toast urselves.\nToast.makeText(context, text, duration).show();",
                        "LayoutInflater inflater = getLayoutInflater();\n" +
                                "View layout = inflater.inflate(R.layout.custom_toast,\n" +
                                "                (ViewGroup) findViewById(R.id.custom_toast_container));\n" +
                                "\n" +
                                "TextView text = (TextView) layout.findViewById(R.id.text);\n" +
                                "text.setText(\"This is a custom toast\");\n" +
                                "\n" +
                                "Toast toast = new Toast(getApplicationContext());\n" +
                                "toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);\n" +
                                "toast.setDuration(Toast.LENGTH_LONG);\n" +
                                "toast.setView(layout);\n" +
                                "toast.show();",
                        "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                "              android:id=\"@+id/custom_toast_container\"\n" +
                                "              android:orientation=\"horizontal\"\n" +
                                "              android:layout_width=\"fill_parent\"\n" +
                                "              android:layout_height=\"fill_parent\"\n" +
                                "              android:padding=\"8dp\"\n" +
                                "              android:background=\"#DAAA\"\n" +
                                "              >\n" +
                                "    <ImageView android:src=\"@drawable/droid\"\n" +
                                "               android:layout_width=\"wrap_content\"\n" +
                                "               android:layout_height=\"wrap_content\"\n" +
                                "               android:layout_marginRight=\"8dp\"\n" +
                                "               />\n" +
                                "    <TextView android:id=\"@+id/text\"\n" +
                                "              android:layout_width=\"wrap_content\"\n" +
                                "              android:layout_height=\"wrap_content\"\n" +
                                "              android:textColor=\"#FFF\"\n" +
                                "              />\n" +
                                "</LinearLayout>"
                ),
                // new data
                new Home_list_data(
                        "",
                        "",
                        "",
                        ""
                ),


                //Testing data
                new Home_list_data(
                        "Testing purpose",
                        "testing",
                        "hughdj",
                        "jsghsj")
        };

        RecyclerView recyclerView = findViewById(R.id.basics_recycleView);
        BasicsAdapter adapter = new BasicsAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}
