package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.bittu.arrayadapter.R;

import java.util.ArrayList;

import models.User;

/**
 * Created by Bittu on 23-04-2017.
 */

public class UsersAdapter extends ArrayAdapter<User> {

    public UsersAdapter(Context context, ArrayList<User> users) {
        super(context,0,users);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        User user=getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user,parent,false);
        }


        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);

        tvName.setText(user.name);
        tvHome.setText(user.hometown);

        return convertView;

    }
}
