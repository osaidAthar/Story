package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.story.R;

import java.util.ArrayList;

import modle.StoryClass;

public class ListViewAdapter extends BaseAdapter {

    private Context mcontext;
    private ArrayList<StoryClass> storyClasseArraylist;

    public ListViewAdapter(Context mcontext, ArrayList<StoryClass> storyClasseArraylist) {
        this.mcontext = mcontext;
        this.storyClasseArraylist = storyClasseArraylist;
    }

    @Override
    public int getCount() {
        return storyClasseArraylist.size ();
    }

    @Override
    public Object getItem(int position) {
        return storyClasseArraylist.get ( position );
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null){

            LayoutInflater layoutInflater = (LayoutInflater) mcontext.getSystemService (mcontext.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate ( R.layout.list_view_item,parent,false );

            viewHolder = new ViewHolder ();

            viewHolder.time = (TextView) convertView.findViewById ( R.id.time ) ;
            viewHolder.title = (TextView) convertView.findViewById ( R.id.title ) ;
            viewHolder.comment = (TextView) convertView.findViewById ( R.id.comment ) ;
            viewHolder.profile = (ImageView) convertView.findViewById ( R.id.banner1 ) ;

            convertView.setTag ( viewHolder );

        }else {

            viewHolder = (ViewHolder) convertView.getTag ();

        }


        StoryClass storyClass = (StoryClass) getItem ( position );
        viewHolder.title.setText ( storyClass.getTitle () );
        viewHolder.time.setText ( storyClass.getTime () );
        viewHolder.comment.setText ( storyClass.getComment () );
        viewHolder.profile.setImageResource ( Integer.parseInt ( storyClass.getProfile () ) );


        return convertView;
    }
    private class ViewHolder{

        ImageView profile;
        TextView title;
        TextView time;
        TextView comment;

    }
}
