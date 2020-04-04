class Solution {
    public int longestStrChain(String[] words) {
        int n = words.length;
        
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        
        Map<String, Integer> maxChains = new HashMap<>();
        int maxChain = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            String word = words[i];
            
            if (!maxChains.containsKey(word)) {
                maxChains.put(word, 1);
            }
            
            int maxChainHere = maxChains.get(word);
            
            
            if (maxChainHere > maxChain) {
                maxChain = maxChainHere; 
            }
            
            for (int ci = 0; ci < word.length(); ci++) {
                String possible = word.substring(0, ci) + word.substring(ci+1);
                
                if (possible.length() == 0) {
                    break;
                }
                
                int maxChainAtPossible = maxChains.getOrDefault(possible, 0);
                
                if (maxChainHere + 1 > maxChainAtPossible) {
                    maxChains.put(possible, maxChainHere + 1);
                }
            }
        }
        
        return maxChain;
    }
}
