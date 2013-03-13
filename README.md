HardonColliderJava
==================

A collision detection library for Java modeled off of core functionality in Matthias Richter's HardonCollider(http://vrld.github.com/HardonCollider/)

Documentation can be found here:
http://nimbusbp1729.github.com/HardonColliderJava/doc/

# Usage

## Creating a new polygonal bound
    int[] x = {0,2,6,7,11};
    int[] y = {0,-3,0,10,2};
    Bound polyBound = Bound.create(x,y);
    
## Creating a new rectangular bound
    int x = 0;
    int y = 0;
    int width = 10;
    int height = 20;
    Bound rectBound = Bound.create(x, y, width, height);
    
## Associating an obect to a bound
    Collidable coll = new SomeClass(); //SomeClass must implement Collidable
    rectBound.setUserData(coll);

Now `coll` will have a list of the collidables it hit whenever a new collision happens!!

This can be accessed by the following:

    coll.getCollisionList();

## Callbacks

when `coll` is colliding with an object

    coll.collision(otherColl);

when `coll` stops colliding with an object

    coll.collisionEnd(otherColl);


###License

Copyright (c) 2010-2011 Matthias Richter

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

Except as contained in this notice, the name(s) of the above copyright holders shall not be used in advertising or otherwise to promote the sale, use or other dealings in this Software without prior written authorization.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
