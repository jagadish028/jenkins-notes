pipeline {
      agent any
          stages {
              stage ('build') {
                  steps {
                  sh ''' 
                      git clone https://github.com/jagadish028/java-project.git
                      cd /var/lib/jenkins/workspace/pipelinejob1/java-project
                      mvn clean install
                      '''
                  }
              }
              stage('deploy') {
                  steps {
                       sh '''
                       cd /var/lib/jenkins/workspace/pipelinejob1/java-project/target/
                       sudo cp *.war /home/ec2-user/tomcat/webapps
                  }
              }
         
          }
}
