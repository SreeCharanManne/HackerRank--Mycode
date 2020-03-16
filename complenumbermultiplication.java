public String complexNumberMultiply(String a, String b) {
        String arr[] = a.split("\\+"),brr[] = b.split("\\+");
        int an = Integer.valueOf(arr[0]);
        int bn = Integer.valueOf(brr[0]);
        int ai = Integer.valueOf(arr[1].substring(0,arr[1].length()-1));
        int bi = Integer.valueOf(brr[1].substring(0,brr[1].length()-1));
        int n = (an*bn)-(ai*bi);
        int i = (an*bi)+(bn*ai);
        return n+"+"+i+"i";
    }
