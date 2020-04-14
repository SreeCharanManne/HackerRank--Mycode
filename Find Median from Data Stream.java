class MedianFinder {
private ArrayList<Double> sets;
    /** initialize your data structure here. */
    public MedianFinder() {
        this.sets = new ArrayList<Double>();
    }
    
    public void addNum(int num) {
        Double d= new Double(num);
        sets.add(d);
        Collections.sort(sets);
    }
    
    public double findMedian() {
        double middle = sets.size()/2;
        if (sets.size()%2 == 1) {
            middle = sets.get(sets.size()/2);
        } else {
           
            middle = (sets.get(sets.size()/2) + sets.get(sets.size()/2 - 1))/2;
        }
      return middle;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
