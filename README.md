1 install nexus
docker run -d -p 8081:8081 --name nexus -v ~/nexus/data:/nexus-data --restart=always sonatype/nexus3

2 create repository
http://localhost:8081/#admin/repository
http://localhost:8081/#admin/repository/repositories
maven2(hosted),edu-release,Release,allow redeploy
maven2(hosted),edu-snapshot,snapshot,allow redeploy
maven2(proxy),alimaven,http://maven.aliyun.com/nexus/content/groups/public/
maven2(group),edu-group, edu-release|edu-snapshot|alimaven


----------------------------------------------------------
取消 git reset --hard 提交

删除远程目录
git rm -r --cached 目录
git commit -m " del " 
git push

