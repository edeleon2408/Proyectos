project_name = "jenkins-pipeline-job"
repo = "https://github.com/edeleon2408/Proyectos.git"
repo_name = "Proyectos"

pipelineJob(project_name){
    definition{
        triggers{
            scm('H/1 * * *')
        }
        cpsScm{
            scm{
                git{
                    remote{
                        name(repo_name)
                        url(repo)
                    }
                }
                scriptPath("Jenkinsfile")
            }
        }
    }
}
