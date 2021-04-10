//import androidx.annotation.NonNull;
//
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.core.Context;
//import com.moringa.covidtracker.Adapter.FirebaseCovidViewHolder;
//import com.moringa.covidtracker.util.OnStartDragListener;
//
//public class FirebaseRestaurantListAdapter extends FirebaseRecyclerAdapter<Restaurant, FirebaseRestaurantViewHolder> implements ItemTouchHelperAdapter {
//    private DatabaseReference mRef;
//    private OnStartDragListener mOnStartDragListener;
//    private Context mContext;
//
//    public FirebaseCovidListAdapter(FirebaseRecyclerOptions<Corona> options,
//                                         DatabaseReference ref,
//                                         OnStartDragListener onStartDragListener,
//                                         Context context){
//        super(options);
//        mRef = ref.getRef();
//        mOnStartDragListener = onStartDragListener;
//        mContext = context;
//    }
//
//    @Override
//    protected void onBindViewHolder(@NonNull FirebaseCovidViewHolder firebaseRestaurantViewHolder, int position, @NonNull Business restaurant) {
//        firebaseRestaurantViewHolder.bindRestaurant(restaurant);
//    }
//
//    @NonNull
//    @Override
//    public FirebaseRestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_item_drag, parent, false);
//        return new FirebaseRestaurantViewHolder(view);
//    }
//
//    @Override
//    public boolean onItemMove(int fromPosition, int toPosition){
//        return false;
//    }
//
//    @Override
//    public void onItemDismiss(int position){
//
//    }