MIN_NUM=106
MAX_NUM=`gh issue list --limit 1 --json number | jq ".[].number"`; 
for n in `seq $MIN_NUM $MAX_NUM`; do 
	gh issue view $n --json assignees,author,body,closed,closedAt,comments,createdAt,id,labels,milestone,number,projectCards,reactionGroups,state,title,updatedAt,url >> github-dump.json; 
done

