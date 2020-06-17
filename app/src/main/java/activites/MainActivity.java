package activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.example.story.R;

import java.util.ArrayList;

import adapter.ListViewAdapter;
import modle.StoryClass;

public class MainActivity extends AppCompatActivity {

    public String [] title = {

            "Android Developers",
            "Web Developers",
            "Game Programing",
            "AI Expert",
            "Special Designer",
            "Game Developer",
            "Programming",
            "Hello World!"
    };
    public String [] profile = {

            String.valueOf ( R.drawable.a ),
            String.valueOf ( R.drawable.b ),
            String.valueOf ( R.drawable.c ),
            String.valueOf ( R.drawable.d ),
            String.valueOf ( R.drawable.e ),
            String.valueOf ( R.drawable.f ),
            String.valueOf ( R.drawable.a ),
            String.valueOf ( R.drawable.b ),
    };
    public String [] time = {

            "12 min ago",
            "25 min ago",
            "12 min ago",
            "25 min ago",
            "12 min ago",
            "25 min ago",
            "12 min ago",
            "25 min ago",
            "12 min ago",

    };
    public String [] comment = {
            "ohh! Hi Osaid Athar How Are You",
            "ohh! Hi Osaid Athar How Are You",
            "ohh! Hi Osaid Athar How Are You",
            "ohh! Hi Osaid Athar How Are You",
            "ohh! Hi Osaid Athar How Are You",
            "ohh! Hi Osaid Athar How Are You",
            "ohh! Hi Osaid Athar How Are You",
            "ohh! Hi Osaid Athar How Are You",
    };

    private ArrayList<StoryClass> storyClass;
    private ListViewAdapter listViewAdapter;
    private ListView ls;

    LayoutInflater lf;

     View headerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        ls = findViewById ( R.id.list );

        lf = this.getLayoutInflater ();
        headerView = (View) lf.inflate ( R.layout.header,null,false );

        ls.addHeaderView (headerView,null, false  );

        storyClass = new ArrayList<> (  );

        for (int i =0;i<title.length;i++){


            StoryClass storyClassob = new StoryClass ( title[i],profile[i],time[i],comment[i]);
            storyClass.add ( storyClassob );
        }

        listViewAdapter = new ListViewAdapter ( MainActivity.this,storyClass );
        ls.setAdapter ( listViewAdapter );
    }
}
