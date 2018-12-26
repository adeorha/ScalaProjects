def isGoodEnough(guess: Int, x: Int): Boolean =
  guess*guess < x && ((guess + 1) * (guess + 1) > x)

def improve(guess: Int, x: Int): Int =
  return (x/guess + guess)/2

def sqrtIter(guess: Int, x: Int): Int =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)

def sqrt(x: Int): Int = sqrtIter(1, x);

sqrt(234244423)