MIN_NUM=106
MAX_NUM=`gh issue list --state all --limit 1 --json number | jq ".[].number"`;
rm -f github-dump.json
for n in `seq $MIN_NUM $MAX_NUM`; do 
	gh issue view $n --json id,number,state,title,author,body,createdAt,closedAt >> github-dump.json; 
done

python3 json2csv.py
