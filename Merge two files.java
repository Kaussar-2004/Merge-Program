//MERGE 2 SORTED LLIST

SinglyLinkedListNode kaussar = new SinglyLinkedListNode(0);
        kaussar.next=null;
        kaussar.data=0;
        
        SinglyLinkedListNode temp = kaussar;
        
        while(true){
            if(head1==null){
                temp.next=head2;
                break;
            }
            else if(head2==null){
                temp.next=head1;
                    break;
            }
            else if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        return kaussar.next;


    }
