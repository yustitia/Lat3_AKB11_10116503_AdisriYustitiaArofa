package aplikasiadis.com.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import aplikasiadis.com.Model.FriendsModel;
import aplikasiadis.com.R;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.FriendsViewHolder> {
    private ArrayList<FriendsModel> mFriendItem;

    public static class FriendsViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView namaGambar;


        public FriendsViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.friendGambar);
            namaGambar = itemView.findViewById(R.id.namaFriendGambar);
        }
    }

    public FriendAdapter(ArrayList<FriendsModel> friendList){
        mFriendItem = friendList;
    }

    @NonNull
    @Override
    public FriendsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_teman,viewGroup,false);
        FriendsViewHolder va = new FriendsViewHolder(v);
        return va;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsViewHolder friendsViewHolder, int position) {
        FriendsModel currentItem = mFriendItem.get(position);
        friendsViewHolder.mImageView.setImageResource(currentItem.getmImageResource());
        friendsViewHolder.namaGambar.setText(currentItem.getNamaGambar());
    }

    @Override
    public int getItemCount() {
        return mFriendItem.size();
    }
}
