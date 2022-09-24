package aminParsian.viewModel;

import java.util.ArrayList;
import aminParsian.viewModel.*;

public class ViewLetter {

    private ArrayList<ViewSarresidElamBedehi> sarresidElamBedehiArrayList;
    private ArrayList<ViewBimeShodeElamBedehkar> bimeShodeElamBedehkarArrayList;
    private ArrayList<ViewResid> viewResidArrayList;

    public ViewLetter () {

    }

    public java.util.ArrayList<ViewResid> getViewResidArrayList () {
        return viewResidArrayList;
    }

    public void setViewResidArrayList (java.util.ArrayList<ViewResid> viewResidArrayList) {
        this.viewResidArrayList = viewResidArrayList;
    }

    public java.util.ArrayList<ViewSarresidElamBedehi> getSarresidElamBedehiArrayList () {
        return sarresidElamBedehiArrayList;
    }

    public void setSarresidElamBedehiArrayList (java.util.ArrayList<ViewSarresidElamBedehi> sarresidElamBedehiArrayList) {
        this.sarresidElamBedehiArrayList = sarresidElamBedehiArrayList;
    }

    public java.util.ArrayList<ViewBimeShodeElamBedehkar> getBimeShodeElamBedehkarArrayList () {
        return bimeShodeElamBedehkarArrayList;
    }

    public void setBimeShodeElamBedehkarArrayList (java.util.ArrayList<ViewBimeShodeElamBedehkar> bimeShodeElamBedehkarArrayList) {
        this.bimeShodeElamBedehkarArrayList = bimeShodeElamBedehkarArrayList;
    }
}
