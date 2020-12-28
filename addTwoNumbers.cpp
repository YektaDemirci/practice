/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode *p, *q, *head,*curr,*temp;
        head = new ListNode(0);
        p=l1;
        q=l2;
        curr=head;
        int carry,n1,n2,sum;
        carry=0;
        sum=0;
        while(p != nullptr || q != nullptr)
        {
            n1 = (p != nullptr) ? p->val : 0;
            n2 = (q != nullptr) ? q->val : 0;
            sum=carry+n1+n2;
            carry=sum/10;
            curr->next = new ListNode(sum%10);
            curr=curr->next;
            if(p != nullptr) p = p->next;
            if(q != nullptr) q = q->next;
        }
        if (carry==1){
            curr->next = new ListNode(1);
            curr=curr->next;
        }
        return head->next;
        
    }
};

/* very BAD solution
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 
#include <math.h>
class Solution {
public:
    int ll2int(ListNode* l1) {
        vector<int> num1;
        ListNode* temp;
        int ctr = 0;
        int no1 = 0;
        temp=l1;
        while( temp->next != nullptr) {
            num1.push_back(temp->val);
            temp=temp->next;
        }
        num1.push_back(temp->val);
        while(num1.size()>0) {
            no1=no1+(num1.front())*pow(10,ctr);
            ctr++;
            num1.erase(num1.begin());
        }
        return no1;
    }
    ListNode* int2ll2(int res) {
        int tempRes=res;
        ListNode* begin,temp;
        while(tempRes>0){
            ListNode* templl;
            templl = new ListNode;
            templl->val=(res%10);
            templl->next=templ;

	
        }
        temp=res%10;
    }
    
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int no1,no2;
        no1=ll2int(l1);
        no2=ll2int(l2);
        cout << no1 << " " << no2;
        return l1;
    }
    
};
*/
