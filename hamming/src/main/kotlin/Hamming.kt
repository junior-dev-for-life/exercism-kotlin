class Hamming {

    companion object {

        fun compute(strand1: String, strand2: String): Int {

            if (strand1.length != strand2.length) {
                throw IllegalArgumentException("left and right strands must be of equal length.")
            }
            
            var distance = 0
            
            if (!strand1.equals(strand2)) {
                for(i in 0..strand1.length - 1) {
                    if(strand1.get(i) != strand2.get(i)) {
                        distance++
                    }
                }
            }
            
            return distance
        }
    }
}