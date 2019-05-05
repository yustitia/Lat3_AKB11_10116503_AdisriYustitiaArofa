package aplikasiadis.com;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

import aplikasiadis.com.Adapter.DailyAdapter;
import aplikasiadis.com.Adapter.FriendAdapter;
import aplikasiadis.com.Model.DailyModel;
import aplikasiadis.com.Model.FriendsModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class FriendsFragment extends Fragment {



    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View myFragmentView = inflater.inflate(R.layout.fragment_daily, container, false);



        ArrayList<FriendsModel> friendsModels = new ArrayList<>();
        friendsModels.add(new FriendsModel(R.drawable.gambar_adis,"M Fajar I"));
        friendsModels.add(new FriendsModel(R.drawable.gambar_adis,"Fata El"));
        friendsModels.add(new FriendsModel(R.drawable.gambar_adis,"Erzi H"));
        friendsModels.add(new FriendsModel(R.drawable.gambar_adis,"Reza AF"));

        mRecycleView = myFragmentView.findViewById(R.id.daily_id_r_h);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new FriendAdapter(friendsModels);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);

        return myFragmentView;


    }

}
