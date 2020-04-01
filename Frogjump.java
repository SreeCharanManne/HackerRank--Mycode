class Solution {
    public boolean canCross(int[] stones) {
        if(stones[1] != 1) return false;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int stone: stones) {
            map.put(stone, new HashSet<>());
        }
        
        map.get(1).add(1);
        System.out.println(map);
        for(int stone: stones) {
            if(stone == 0) continue;
            Set<Integer> preJumps = map.get(stone);
            for(int preJump: preJumps) {
                int jump;
                jump = preJump - 1;
                if(jump > 0 && map.containsKey(stone + jump)) {
                    map.get(stone + jump).add(jump);
                }
                jump = preJump;
                if(map.containsKey(stone + jump)) {
                    map.get(stone + jump).add(jump);
                }
                jump = preJump + 1;
                if(map.containsKey(stone + jump)) {
                    map.get(stone + jump).add(jump);
                }
            }
        }
        return map.get(stones[stones.length - 1]).size() != 0;
    }
}
