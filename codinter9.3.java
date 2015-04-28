public static int getAns(int [] a,int start,int end){
    	int ans=-1;
    	if(start>end) return ans;
    	int mid=(start+end)/2;
    	if(mid==a[mid]) return mid;
    	if(mid>a[mid]) ans=getAns(a,mid+1,end);
    	if(mid<a[mid]) ans=getAns(a,start,mid-1);
    	return ans;
    }
