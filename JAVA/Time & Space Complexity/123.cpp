#include <iostream>
#include <vector>
using namespace std;

class PriorityQueue
{
    vector<int> pq;

public:
    int getsize()
    {
        return pq.size();
    }

    int getmax()
    {
        if (pq.size() == 0)
            return 0;
        return pq[0];
    }
    bool IsEmpty()
    {
        return pq.size() == 0;
    }

    void insert(int element)
    {
        pq.push_back(element);
        int childIndex = pq.size() - 1;

        while (childIndex > 0)
        {
            int parentIndex = (childIndex - 1) / 2;

            if (pq[childIndex] > pq[parentIndex])
            {
                int temp = pq[childIndex];
                pq[childIndex] = pq[parentIndex];
                pq[parentIndex] = temp;
            }
            else
            {
                break;
            }
            childIndex = parentIndex;
        }
    }

    int removemax()
    {
        if (IsEmpty())
        {
            return 0;
        }

        int ans = pq[0];
        pq[0] = pq[pq.size() - 1];
        pq.pop_back();

        int parentIndex = 0;
        int LeftChildIndex = 2 * parentIndex + 1;
        int RightChildIndex= 2* parentIndex+2;

        while(LeftChildIndex<pq.size())
        {
            int maxIndex= parentIndex;
            if(pq[maxIndex]<pq[LeftChildIndex])
            {
                maxIndex=LeftChildIndex;
            }
            if(RightChildIndex<pq.size() && pq[RightChildIndex] > pq[maxIndex])
            {
                maxIndex=RightChildIndex;
            }
            if(maxIndex==parentIndex)
            {
                break;
            }

            int temp= pq[maxIndex];
            pq[maxIndex]= pq[parentIndex];
            pq[parentIndex]= temp;

            parentIndex=maxIndex;
            int LeftChildIndex = 2 * parentIndex + 1;
            int RightChildIndex= 2* parentIndex+2;
        }
        return ans;
    }
};

int main()
{
    PriorityQueue p;
    p.insert(15);
    p.insert(2);
    p.insert(20);
    p.insert(9);
    p.insert(0);
    p.insert(100);

    cout << p.getsize() << endl;
    cout << p.getmax() << endl;

    while(!p.IsEmpty())
    {
        cout<<p.removemax();
    }
    cout<<"hello World";
    return 0;
}